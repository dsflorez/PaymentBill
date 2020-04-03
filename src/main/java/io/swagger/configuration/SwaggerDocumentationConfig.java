package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("PaymentBill")
            .description("payment bill to pay in the future")
            .license("MIT")
            .licenseUrl("http://opensource.org/licenses/MIT")
            .termsOfServiceUrl("https://pyme.k8s-bancolombia-dev.us-south.containers.mybluemix.net")
            .version("1.0.0")
            .contact(new Contact("","", "dsflorez@bancolombia.com.co"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
