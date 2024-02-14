package com.zergatstage.gbsprings06;

import com.zergatstage.gbsprings06.model.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ConfigurationPropertiesScan("com.zergatstage.GbSpringS06SrbApiApplication.config")
public class GbSpringS06SrbApiApplication {

	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

	@Bean
	public HttpHeaders headers(){
		return new org.springframework.http.HttpHeaders();
	}

	public static void main(String[] args) {

		SpringApplication.run(GbSpringS06SrbApiApplication.class, args);
	}

}
