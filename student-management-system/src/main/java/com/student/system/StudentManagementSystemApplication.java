package com.student.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.system.entity.Student;
import com.student.system.repository.StudentRepository;

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
		 * Student student1= new Student("Kumar", "Shubham", "mail3me@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2= new Student("jai", "bhole", "mailm3e3@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3= new Student("Yo", "Yo", "mailmwewe@gmail.com");
		 * studentRepository.save(student3);
		 */
		
		
		
		
	}

}
