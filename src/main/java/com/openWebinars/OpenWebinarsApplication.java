package com.openWebinars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class OpenWebinarsApplication {

	/**
	 * Primera prueba de Hola mundo 
	 * con localhost:9009/ en el navegador sale el String que te devuelve el método
	 */
	@RequestMapping("/")
	String home() {
		return "Hello Word Spring Boot!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenWebinarsApplication.class, args);
	}

}
