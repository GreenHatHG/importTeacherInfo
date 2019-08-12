package team.weacsoft.importTeacherInfo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
@IdClass(RelationPK.class)
public class TeacherInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    @Id
    private String name;

    @Id
    private String jobNumber;

    @Column(nullable = false)
    private String office;

    private String phone;

    @Column(nullable = false)
    private String ftpNumber;

    @Column(nullable = false)
    private String ftpPassword;

}
