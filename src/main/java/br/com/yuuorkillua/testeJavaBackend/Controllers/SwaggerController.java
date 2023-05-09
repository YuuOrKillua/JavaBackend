package br.com.yuuorkillua.testeJavaBackend.Controllers;

import java.lang.annotation.Annotation;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unchecked")
@Configuration
public class SwaggerController{
    @Bean
    GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("springshop-public")
				.pathsToMatch("/public/**")
				.build();
	}

    @Bean
    GroupedOpenApi adminApi() {
		return GroupedOpenApi.builder()
				.group("springshop-admin")
				.pathsToMatch("/admin/**")
				.addOpenApiMethodFilter(method -> method.isAnnotationPresent((Class<? extends Annotation>) Admin.class))
				.build();
	}
}