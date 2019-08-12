// package team.weacsoft.importTeacherInfo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RestController;

// import team.weacsoft.importTeacherInfo.dao.TeacherInfoDao;

// /**
//  * @description: 数据库删除接口
//  * @author: GreenHatHG
//  * @create: 2019-08-12 15:04
//  **/

// @RestController
// public class Delete{

//     @Autowired
//     private TeacherInfoDao teacherInfoDao;

//     @DeleteMapping("/teacherinfos")
//     public void deleteAll(){
//         teacherInfoDao.deleteAll();
//     }

//     // @GetMapping("/teacherinfos/name/{name}")
//     // public List<TeacherInfo> findByName(@PathVariable("name") String name){
//     //     return teacherInfoDao.findByName(name); 
//     // }

//     // @GetMapping("/teacherinfos/jobNumber/{jobNumber}")
//     // public TeacherInfo findByJobNumber(@PathVariable("jobNumber") String jobNumber){
//     //     return teacherInfoDao.findByJobNumber(jobNumber);
//     // }

// }