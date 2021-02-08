package springbootdevops.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootdevops.entity.Student;
import springbootdevops.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	@PostConstruct
	public void AddValues() {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student( "Sai Krishna", "Hyderabad", "9160833673"));
		list.add(new Student( "Sravan Kumar", "Hyderabad", "9666629770"));
		repo.saveAll(list);
	}
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
}
