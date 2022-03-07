package in.keepgrowing.springboottypesafeuserroles.documentation.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi(SwaggerProperties properties) {
        return new OpenAPI()
                .info(getInfo(properties));
    }

    private Info getInfo(SwaggerProperties properties) {
        return new Info()
                .title(properties.projectTitle())
                .description(properties.projectDescription())
                .version(properties.projectVersion())
                .license(new License()
                        .name("Unlicese")
                        .url("https://unlicense.org/"));
    }
}
