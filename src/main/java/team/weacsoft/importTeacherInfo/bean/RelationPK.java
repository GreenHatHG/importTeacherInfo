package team.weacsoft.importTeacherInfo.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * @description: 复合主键配置
 * @author: GreenHatHG
 * @create: 2019-08-12 02:04
 **/

 @Data
public class RelationPK implements Serializable{

    private static final long serialVersionUID = -9211011751209326828L;

    private String name;
    
    private String jobNumber;
}
