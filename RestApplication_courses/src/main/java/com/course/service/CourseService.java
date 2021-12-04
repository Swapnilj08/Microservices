package com.course.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.course.entities.Courses;

@Component
public interface CourseService {
	public List<Courses> getCourses();

	public Courses getcourse(long courseId);

	public Courses addcourse(Courses course);

	public Courses updatecourse(Courses course);

	public void deletecourse(long courseId);
}
