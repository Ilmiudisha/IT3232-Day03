package vau.ac.lk.it.controller;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vau.ac.lk.it.model.Student;


@RestController
@Controller
@RequestMapping("/app")

public class Appcontroller {
		
	Student obj1 = new Student("ICT01","Ilmi",23,"ICT",3.3);
	Student obj2 = new Student("ICT02","Ibran",23,"ICT",3.3);
	Student obj3 = new Student("ICT03","Dilux",23,"ICT",3.3);
	Student obj4 = new Student("ICT04","Muniweera",23,"ICT",3.3);
	
	List<Student> students = new ArrayList<Student>();
	
	@GetMapping("/msg")
	public String myMessage()
	{
		return "Hello SpringBoot";
	}
	@GetMapping("/name")
	public String myName()
	{
		return "My name is SpringBoot";
	}
	@GetMapping("/age/{ag}")
	public String myAge(@PathVariable("ag")int age)
	{
		return "My age is "+age;
	}
	@GetMapping("/student")
	public Student getStudent() {
		return obj1;
	}
	
	/*@GetMapping("/students")
	public List<Student> getStudents()
	{
		students.add(obj1);
		students.add(obj2);
		students.add(obj3);
		students.add(obj4);
		
		return students;
	}*/
	

}
