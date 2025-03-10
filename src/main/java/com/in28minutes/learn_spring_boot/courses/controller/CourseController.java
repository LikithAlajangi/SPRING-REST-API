package com.in28minutes.learn_spring_boot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learn_spring_boot.courses.bean.Course;
import com.in28minutes.learn_spring_boot.courses.repository.CourseRepository;

@RestController
public class CourseController {
//http://localhost:8080/courses
	@Autowired
	private CourseRepository repository;
	//GET
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
//		return Arrays.asList(new Course(1,"Learn MicroServices 22","in28minutes"),
//				new Course(2,"Learn React","in28minutes"));
		return repository.findAll();
	} 
	//GET
	@GetMapping("/courses/{id}")
	public Course getcourseDetails(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		
		if(course.isEmpty()) {
			throw new RuntimeException("Course not found with id :"+id);
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createcourse(@RequestBody Course course) {
		repository.save(course);	
	}
	
	@PutMapping("/courses/{id}")
	public void updatecourse(@PathVariable long id,@RequestBody Course updatedcourse) {
		repository.save(updatedcourse);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deletecourse(@PathVariable long id) {
		repository.delete(repository.findById(id).get());//check for if course exists before
	}
}
