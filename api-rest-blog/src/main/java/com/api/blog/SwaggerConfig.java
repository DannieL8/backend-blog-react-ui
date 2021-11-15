package com.api.blog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).build();
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
    }


    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2) .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey())).
        select().
                paths(PathSelectors.any()).
                apis(RequestHandlerSelectors.basePackage("com.api.blog")).build();
    }

    @Bean
    public Docket swaggerPersonApi12() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api-1.2")
                .select()
                .apis(p -> {
                    if (p.produces() != null) {
                        for (MediaType mt : p.produces()) {
                            if (mt.toString().equals("application/vnd.piomin.app-v1.2+json")) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .build()
                .produces(Collections.singleton("application/vnd.piomin.app-v1.2+json"))
                .apiInfo(new ApiInfoBuilder().version("1.2").title("Posts API").description("Documentation Person API v1.2").build());
    }

    @Bean
    public Docket swaggerPersonApi13() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("person-api-1.3")
                .select()
                .apis(p -> {
                    if (p.produces() != null) {
                        for (MediaType mt : p.produces()) {
                            if (mt.toString().equals("application/vnd.piomin.app-v1.3+json")) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .build()
                .produces(Collections.singleton("application/vnd.piomin.app-v1.3+json"))
                .apiInfo(new ApiInfoBuilder().version("1.3").title("POSTS v1.3").description("Documentation Posts API v1.3").build());
    }

    
}
