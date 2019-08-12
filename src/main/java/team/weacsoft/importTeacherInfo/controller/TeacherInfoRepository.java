package team.weacsoft.importTeacherInfo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

/**
 * @description: 定义Repository
 * @author: GreenHatHG
 * @create: 2019-08-12 16:57
 **/

@RepositoryRestResource(path = "teacherinfos")
public interface TeacherInfoRepository extends JpaRepository<TeacherInfo, Long> {
}