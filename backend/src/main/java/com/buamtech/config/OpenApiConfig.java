package com.buamtech.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI buamtechOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Buamtech API Documentation")
                        .description("REST API for Buamtech Web Platform — powering DevOps & Digital Solutions")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Buamtech DevOps Team")
                                .url("https://github.com/Buamtech")
                                .email("support@buamtech.com"))
                        .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/LICENSE-2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("Buamtech Project Documentation")
                        .url("https://docs.buamtech.cloud"));
    }
}
