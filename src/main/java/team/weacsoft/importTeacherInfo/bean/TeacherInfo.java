package team.weacsoft.importTeacherInfo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * @description: 教师个人信息定义
 * @author: GreenHatHG
 * @create: 2019-08-09 14:51
 **/

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TeacherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String jobNumber;

    @Column(nullable = false)
    private String office;

    private String phone;

    @Column(nullable = false)
    private String ftpNumber;

    @Column(nullable = false)
    private String ftpPassword;

}
