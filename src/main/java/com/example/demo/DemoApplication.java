package com.example.demo;

import com.example.demo.beans.Employee;
import com.example.demo.enums.Fonction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*
		Employee emp1;
		emp1 = new Employee("zdfi112",
				"Amgad",
				"amgad@gmail.com",
				"0667551340",
				"4 Place de Barcelone",
				Fonction.CHEF_PROJET);
		System.out.println(emp1.toString());
		*/
	}
}
