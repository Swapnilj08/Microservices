package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.entities.Courses;
import com.course.service.CourseService;

@RestController
@CrossOrigin
public class MainController {

	@Autowired
	private CourseService courseService;

	// get course list handler
	@GetMapping("/courses")
	public List<Courses> getcourses() {

		return courseService.getCourses();
	}

	// get single course handler
	@GetMapping("/course/{id}")
	public Courses getcourse(@PathVariable long courseId) {
		return courseService.getcourse(courseId);
	}

	// add course handler
	@PostMapping("/courses")
	public Courses addcourse(@RequestBody Courses course) {

		return courseService.addcourse(course);
	}

	// update course handler
	@PutMapping("/updatecourse")
	public Courses updatecourse(@RequestBody Courses course) {

		return courseService.updatecourse(course);
	}

	// delete course handler
	@DeleteMapping("/courses/delete/{id}")
	public void deletecourse(@PathVariable("id") long courseId) {
		courseService.deletecourse(courseId);

	}

}
