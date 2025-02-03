package com.mipagina.bring_all_products_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("youremail@example.com");
        contact.setName("API Support");
        contact.setUrl("https://www.yourwebsite.com");

        License license = new License()
                .name("Apache License 2.0")
                .url("https://www.apache.org/licenses/LICENSE-2.0");

        Info info = new Info()
                .title("Bring All Products API")
                .version("1.0")
                .contact(contact)
                .description("This API retrieves all products from the menu of the restaurant.")
                .license(license);

        return new OpenAPI().info(info);
    }
}
