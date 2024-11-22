package com.springboot.first.app;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//@Controller

@RestController
public class HelloWorldController {

	//get
	//post
	//put
	//delete
	
	// GET HTTP Method
	// http://localhost:8082/hello-world
	
	@GetMapping("/hello-world")
	public String helloworld() {
		
	return "Hello World!";
		
	}
}
