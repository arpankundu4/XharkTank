package com.crio.xharktank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.InMemorySwaggerResourcesProvider;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
// Configuration class
// for swagger api documentation
public class SwaggerConfig {

    @Bean
    // returns a prepared Docket instance
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/pitches/**"))
                .apis(RequestHandlerSelectors.basePackage("com.crio.xharktank"))
                .build();
    }

    @Primary
    @Bean
    // swagger specifications config
    // uses src/main/resources/static/swagger.json file
    public SwaggerResourcesProvider swaggerResourcesProvider(InMemorySwaggerResourcesProvider defaultResourcesProvider) {
        return () -> {
            SwaggerResource wsResource = new SwaggerResource();
            wsResource.setName("XharkTank APIs");
            wsResource.setSwaggerVersion("2.0");
            wsResource.setLocation("/swagger.json");

            List<SwaggerResource> resources = new ArrayList<>(defaultResourcesProvider.get());
            resources.clear();
            resources.add(wsResource);
            return resources;
        };
    }

}
