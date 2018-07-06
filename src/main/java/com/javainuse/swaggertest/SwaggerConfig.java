package com.javainuse.swaggertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final String SWAGGER_API_VERSION = "1.0";
	private static final String LICENCE_TEXT = "License";
	private static final String title = "GFITS GSYW REST API";
	private static final String description = "Restful API for GSYW-GFITS";

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).version(SWAGGER_API_VERSION)
				.license(LICENCE_TEXT).build();
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).pathMapping("/").select()
				.paths(PathSelectors.any()).build();
	}
}