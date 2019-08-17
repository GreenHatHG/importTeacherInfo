package team.weacsoft.importTeacherInfo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description: 教师个人信息定义
 * @author: GreenHatHG
 * @create: 2019-08-09 14:51
 **/

@Data
@Entity(name ="teacherinfo")
@AllArgsConstructor
@NoArgsConstructor
public class TeacherInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String name;

    private String jobNumber;

    @Column(nullable = false)
    private String office;

    private String phone;

    @Id
    private String ftpNumber;

    @Column(nullable = false)
    private String ftpPassword;

}
