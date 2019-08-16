 package team.weacsoft.importTeacherInfo.controller;

 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

 /**
  * @description: 数据库删除接口
  * @author: GreenHatHG
  * @create: 2019-08-12 15:04
  **/

 @RestController
 public class Delete{

     @Autowired
     private TeacherInfoRepository teacherInfoRepository;

     @DeleteMapping("/teacherinfos")
     public void deleteAll(){
         teacherInfoRepository.deleteAll();
     }

 }