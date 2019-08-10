package team.weacsoft.importTeacherInfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @description: swagger配置
 * @author: GreenHatHG
 * @create: 2019-08-10 13:43
 **/

@Configuration
@EnableSwagger2
public class Swagger{

    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("team.weacsoft.importTeacherInfo.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .description("导入教师信息到mysql")
                        .contact(new Contact("GreenHatHG",
                                "https://greenhathg.github.io/",
                                "1239776759@qq.com"))
                        .title("导入教师信息API文档")
                        .build());
    }
}