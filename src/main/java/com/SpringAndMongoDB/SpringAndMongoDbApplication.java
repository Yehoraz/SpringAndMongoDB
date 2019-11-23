package com.SpringAndMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringAndMongoDB.repos.Person;
import com.SpringAndMongoDB.repos.PersonRepository;

@SpringBootApplication
public class SpringAndMongoDbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = (ApplicationContext)SpringApplication.run(SpringAndMongoDbApplication.class, args);
		System.out.println("Start");
		PersonRepository personRepository = ctx.getBean(PersonRepository.class);
		Person p1 = new Person(123, "test");
		personRepository.save(p1);
		System.out.println("End");
		
	}

}
