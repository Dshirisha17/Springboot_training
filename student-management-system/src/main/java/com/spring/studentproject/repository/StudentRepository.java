package com.spring.studentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.List;

import com.spring.studentproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

//	List<Student> findAll();

}
