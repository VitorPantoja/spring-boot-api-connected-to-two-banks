package com.leaddell.emotionreportapi;

import com.leaddell.emotionreportapi.model.product.Product;
import com.leaddell.emotionreportapi.model.user.User;
import com.leaddell.emotionreportapi.repository.user.UserRepository;
import com.leaddell.emotionreportapi.service.ProductService;
import com.leaddell.emotionreportapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EmotionReportApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmotionReportApiApplication.class, args);
	}

	@Autowired
	UserService personService;
	@Autowired
	ProductService deptService;

//	@Autowired
//	@Bean
//	public CommandLineRunner run(UserRepository repository) {
//		return (args) -> {
//			saveUserDetails();
//			saveDepartmentDetails();
////			getAllPerson();
////			getDepartments();
//		};
//	}

	public User saveUserDetails(){
		User person = new User();
		person.setName("Chandra Shekhar Goka");
		person.setEmail("Hyderabad@email");
		return personService.savePerson(person);
//		return person;
	}

	public Product saveDepartmentDetails(){
		Product dept = new Product();
		dept.setName("IT");
		//return deptService.saveDepartment(dept);
		return dept;
	}

	public void getAllPerson(){
		List persons = personService.getAllPersons();
		persons.forEach(System.out::println);
	}

	public void getDepartments(){
		List depts = deptService.getAllDepartment();
		depts.forEach(System.out::println);
	}



}
