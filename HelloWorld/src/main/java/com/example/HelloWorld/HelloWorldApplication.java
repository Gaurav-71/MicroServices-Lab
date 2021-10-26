package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class HelloWorldApplication {
@RequestMapping("/")
	String home(){
		return "<a href='/hello'>Simple Hello</a><br><a href='/hello1/Gaurav'>Path Var Hello</a><br><a href='/hello3?id=1&name=msrit'>From URL</a>";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
