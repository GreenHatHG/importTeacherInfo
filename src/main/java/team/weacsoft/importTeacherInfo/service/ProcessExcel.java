package team.weacsoft.importTeacherInfo.service;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import team.weacsoft.importTeacherInfo.dao.TeacherInfoDao;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

import java.util.List;

/**
 * @description: 获得上传到的excel(.xls .xlsx)的数据
 * @author: GreenHatHG
 * @create: 2019-08-09 14:49
 **/

@Component
public class ProcessExcel {

    @Autowired
    private TeacherInfoDao teacherInfoDao;

    private List<TeacherInfo> teacherInfos = null;
    private MultipartFile uploadFile = null;

    /**
     * 获得文件里面的数据
     */
    public String getData(){
        try{
            ExcelReader reader = ExcelUtil.getReader(uploadFile.getInputStream());
            teacherInfos = reader.readAll(TeacherInfo.class);
        }catch (Exception e){
            return "error";
        }
        return null;
    }

    public String saveToMysql(MultipartFile uploadFile){
        this.uploadFile = uploadFile;
        if("error".equals(getData())){
            return "error";
        }
        try{
            for(TeacherInfo teacherInfo : teacherInfos){
                teacherInfoDao.save(teacherInfo);
            }
        }catch (Exception e){
            return "dataError";
        }
        return "success";
    }

    public void truncateTable(){
        teacherInfoDao.deleteAll();
    }

}