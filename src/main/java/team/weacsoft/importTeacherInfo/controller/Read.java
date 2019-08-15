// package team.weacsoft.importTeacherInfo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

// /**
//  * @description: 数据库查询接口
//  * @author: GreenHatHG
//  * @create: 2019-08-12 01:04
//  **/

// @RestController
// public class Read{

//     @Autowired
//     private TeacherInfoDao teacherInfoDao;

//     @GetMapping("/teacherinfos")
//     public List<TeacherInfo> findAll(){
//         return teacherInfoDao.findAll();
//     }

//     @GetMapping("/teacherinfos/name/{name}")
//     public List<TeacherInfo> findByName(@PathVariable("name") String name){
//         return teacherInfoDao.findByName(name); 
//     }

//     @GetMapping("/teacherinfos/jobNumber/{jobNumber}")
//     public TeacherInfo findByJobNumber(@PathVariable("jobNumber") String jobNumber){
//         return teacherInfoDao.findByJobNumber(jobNumber);
//     }



// }