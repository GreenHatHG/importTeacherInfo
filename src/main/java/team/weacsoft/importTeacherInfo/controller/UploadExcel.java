package team.weacsoft.importTeacherInfo.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import team.weacsoft.importTeacherInfo.exception.CustomException;
import team.weacsoft.importTeacherInfo.service.ProcessExcel;

/**
 * @description: Excel文件上传处理接口
 * @author: GreenHatHG
 * @create: 2019-08-09 14:32
 **/

@RestController
public class UploadExcel {

    @Autowired
    private ProcessExcel processExcel;

    @PostMapping("/upload")
    @ApiResponses({
        @ApiResponse(code=404, message = "上传文件为空"),
        @ApiResponse(code = 500, message = "处理异常，请检查表格内容"),
        @ApiResponse(code = 428, message = "Excel内容格式不符合要求")})
    public void upload(MultipartFile[] file) {

        for (MultipartFile uploadFile : file) {
            if (uploadFile == null || uploadFile.getSize() <= 0) {
                throw new CustomException(404, "上传的文件为空");
            }

            String msg = processExcel.saveToMysql(uploadFile);
            if ("error".equals(msg)) {
                throw new CustomException(500, "处理异常,请联系作者");
            } else if ("dataError".equals(msg)) {
                throw new CustomException(428, "Excel内容格式不符合要求");
            }

        }
    }
}

