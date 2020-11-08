package com.yagna.remotework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class RemoteWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteWorkApplication.class, args);
	}

	@RequestMapping("/employee")
	public List<Employee> findAll(){
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("q1", "QA", 1));
		list.add(new Employee("q2", "QA", 1));
		list.add(new Employee("q3", "QA", 1));
		list.add(new Employee("q4", "QA", 1));
		list.add(new Employee("q5", "QA", 1));
		list.add(new Employee("q6", "QA", 1));

		return list;
	}

}
