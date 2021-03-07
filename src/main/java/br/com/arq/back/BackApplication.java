package br.com.arq.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;

 
@RestController
@EnableAutoConfiguration
@SpringBootApplication
@EnableEmailTools
public class  BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

	@RequestMapping("/home")
	public String hello() {
		return "Hello Pedro!";
	}
 
}
