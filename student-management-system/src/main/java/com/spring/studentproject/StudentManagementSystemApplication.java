package com.spring.studentproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.studentproject.entity.Student;
import com.spring.studentproject.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Shirisha","Dodla", "shirisha@gamil.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Siri","Reddy", "siri@gamil.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Sathish","Goud", "sathish@gamil.com");
		 * studentRepository.save(student3);
		 */
	}

}
