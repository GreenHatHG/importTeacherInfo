package team.weacsoft.importTeacherInfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @description: swagger配置
 * @author: GreenHatHG
 * @create: 2019-08-10 13:43
 **/

@Configuration
// public class Swagger implements WebMvcConfigurer{
public class Swagger{
    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.regex("(?!/error).+"))
                .paths(PathSelectors.regex("(?!/profile).+"))
                .build()
                .enableUrlTemplating(true)
                .apiInfo(new ApiInfoBuilder()
                        .title("教师信息表API文档")
                        .description("Mysql中教师信息表的增删改查操作")
                        .contact(new Contact("GreenHatHG",
                                "https://greenhathg.github.io/",
                                "1239776759@qq.com"))
                        .license("Apache 2.0")
                        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                        .build());
    }

}