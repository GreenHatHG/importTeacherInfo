package team.weacsoft.importTeacherInfo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 自定义异常
 * @author: GreenHatHG
 * @create: 2019-08-10 02:08
 **/

@Data
@AllArgsConstructor
public class ErrorResponseEntity {

    private int code;
    private String message;

}