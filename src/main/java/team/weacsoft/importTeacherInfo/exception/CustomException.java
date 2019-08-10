package team.weacsoft.importTeacherInfo.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author: GreenHatHG
 * @create: 2019-08-10 02:12
 **/

@Getter
@Setter
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 4564124491192825748L;

    private int code;

    public CustomException(int code, String message) {
        super(message);
        this.setCode(code);
    }
}