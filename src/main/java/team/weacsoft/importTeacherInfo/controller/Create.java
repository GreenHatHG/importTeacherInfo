package team.weacsoft.importTeacherInfo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;
import team.weacsoft.importTeacherInfo.service.TeacherInfoRepository;

import java.util.List;

/**
 * @author GreenHatHG
 * @description 数据库插入接口
 * @create 2019-08-17 3:12
 */

@RestController
public class Create {

    @Autowired
    private TeacherInfoRepository teacherInfoRepository;

    @PostMapping("/teacherinfos")
    @ApiOperation(value = "Save"
                    ,notes = "批量插入"
                    ,nickname = "Save")
    public void Save( @RequestBody List<TeacherInfo> list){
        teacherInfoRepository.saveAll(list);
    }
}
