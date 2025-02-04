package com.example.brief17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.brief17.entity.Student;
import com.example.brief17.service.StudentService;

@SpringBootApplication
public class Brief17Application {

	public static void main(String[] args) {
		SpringApplication.run(Brief17Application.class, args);
	}

}
