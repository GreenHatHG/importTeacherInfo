package team.weacsoft.importTeacherInfo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;
import team.weacsoft.importTeacherInfo.service.TeacherInfoRepository;

/**
  * @description: 数据库删除接口
  * @author: GreenHatHG
  * @create: 2019-08-12 15:04
  **/

@RequestMapping(value="/teacherinfos")
@RestController
public class Delete{

     @Autowired
     private TeacherInfoRepository teacherInfoRepository;

     @Transactional
     @DeleteMapping("")
     @ApiOperation(value = "deleteAll"
                    ,notes = "删除表中所有数据，保留表结构"
                    ,nickname = "deleteAll")
     public void deleteAll(){
         teacherInfoRepository.deleteAll();
     }

     @Transactional
     @DeleteMapping("/{id}")
     @ApiOperation(value = "deleteById"
                    ,notes = "根据id删除表中的记录"
                    ,nickname = "deleteById")
     public void deleteOne(@PathVariable("id") String id){
         TeacherInfo t = teacherInfoRepository.findByFtpNumber(id);
         teacherInfoRepository.delete(t);
     }
 }