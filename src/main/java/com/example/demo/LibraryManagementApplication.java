


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.BookDetails;
import com.example.demo.services.BookDetailService;
import springfox.documentation.annotations.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@CrossOrigin(value = "*")
@EnableSwagger2
@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
	 SpringApplication.run(LibraryManagementApplication.class, args);
		
	}
}


