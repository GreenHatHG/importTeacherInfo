package team.weacsoft.importTeacherInfo.controller;

import io.swagger.annotations.Api;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import springfox.documentation.annotations.ApiIgnore;
import team.weacsoft.importTeacherInfo.bean.TeacherInfo;

import java.util.List;

/**
 * @description: 定义Repository
 * @author: GreenHatHG
 * @create: 2019-08-12 16:57
 **/

@ApiIgnore
@Api(tags = "TeacherInfo Entity")
@RestResource(path = "teacherinfos")
public interface TeacherInfoRepository extends CrudRepository<TeacherInfo, String> {

    List<TeacherInfo> findByName(String name);

    List<TeacherInfo> findByJobNumber(String jobnumber);

    List<TeacherInfo> findByOffice(String office);

    List<TeacherInfo> findByPhone(String phone);

    TeacherInfo findByFtpNumber(String ftpnumber);

    List<TeacherInfo> findByFtpPassword(String ftppassword);

}