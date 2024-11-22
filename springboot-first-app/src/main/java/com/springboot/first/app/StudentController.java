package com.springboot.first.app;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
	
	//http://local:8083/student 
	@GetMapping("/student")
	public Student getStudent() {
	 return new Student ("Shirisha", "Dodla");
	}

	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Shirisha", "Dodla"));
		students.add(new Student("Siri", "Dodla"));
		students.add(new Student("adhaya", "sharma"));
		students.add(new Student("Sushi", "reddy"));
		students.add(new Student("Shirisha", "Goud"));
		
		return students;
	}
	
	//http://localhost:8080/student/shirisha/dodal-- Path variable 
	//@PathVariable annotation
//	@GetMapping("{firstName}/{lastName}")
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName")  String lastName) {
		return new Student(firstName, lastName);
	}
	
	//build rest API to handle query parameters
	//http://localhost:8080/student?firstName=Shirisha&lastName=Dodla
	
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name = "firstName") String firstName,  
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
}
