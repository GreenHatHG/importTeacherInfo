package team.weacsoft.importTeacherInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
@SpringBootApplication
public class ImportTeacherInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportTeacherInfoApplication.class, args);
    }

}
