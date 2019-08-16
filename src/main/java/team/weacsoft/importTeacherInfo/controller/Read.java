 package team.weacsoft.importTeacherInfo.controller;

 import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

import java.util.List;

 /**
  * @description: 数据库查询接口
  * @author: GreenHatHG
  * @create: 2019-08-12 01:04
  **/

 @RestController
 @Api(tags = "TeacherInfo Entity", value = "CRUD")
 public class Read{

     @Autowired
     private TeacherInfoRepository teacherInfoRepository;

//     @GetMapping("/teacherinfos/{id}")
//     @ApiOperation(tags = {"1.0.7"}, value = "findById", nickname = "findById")
//     public Optional<TeacherInfo> findById(@PathVariable("id") String id){
//         return teacherInfoRepository.findById(id);
//     }

     @GetMapping("/teacherinfos/name/{name}")
     @ApiOperation(tags = {"1.0.1"}, value = "findByName", nickname = "findByName")
     public List<TeacherInfo> findByName(@PathVariable("name") String name){
         return teacherInfoRepository.findByName(name);
     }

     @GetMapping("/teacherinfos/jobnumber/{jobnumber}")
     @ApiOperation(tags = {"1.0.2"}, value = "findByJobNumber", nickname = "findByJobNumber")
     public List<TeacherInfo> findByJobNumber(@PathVariable("jobnumber") String jobnumber){
            return teacherInfoRepository.findByJobNumber(jobnumber);
     }

     @GetMapping("/teacherinfos/office/{office}")
     @ApiOperation(tags = {"1.0.3"}, value = "findByOffice", nickname = "findByOffice")
     public List<TeacherInfo> findByOffice(@PathVariable("office") String office){
         return teacherInfoRepository.findByOffice(office);
     }

     @GetMapping("/teacherinfos/phone/{phone}")
     @ApiOperation(tags = {"1.0.4"}, value = "findByPhone", nickname = "findByPhone")
     public List<TeacherInfo> findByPhone(@PathVariable("phone") String phone){
         return teacherInfoRepository.findByPhone(phone);
     }

     @GetMapping("/teacherinfos/ftpnumber/{ftpnumber}")
     @ApiOperation(tags = {"1.0.5"}, value = "findByFtpNumber", nickname = "findByFtpNumber")
     public TeacherInfo findByFtpNumber(@PathVariable("ftpnumber") String ftpnumber){
         return teacherInfoRepository.findByFtpNumber(ftpnumber);
     }

     @GetMapping("/teacherinfos/ftppassword/{ftppassword}")
     @ApiOperation(tags = {"1.0.6"}, value = "findByFtpPassword", nickname = "findByFtpPassword")
     public List<TeacherInfo> findByFtpPassword(@PathVariable("ftppassword") String ftppassword){
         return teacherInfoRepository.findByFtpPassword(ftppassword);
     }

 }