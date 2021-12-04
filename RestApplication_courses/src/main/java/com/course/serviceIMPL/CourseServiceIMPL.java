package com.course.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.course.DAO.CourseDAO;
import com.course.entities.Courses;
import com.course.service.CourseService;

@Component
public class CourseServiceIMPL implements CourseService {

	@Autowired
	private CourseDAO courseDAO;

	@Override
	public List<Courses> getCourses() {

		return courseDAO.findAll();
	}

	@Override
	public Courses getcourse(long courseId) {

		return courseDAO.getById(courseId);
	}

	@Override
	public Courses addcourse(Courses course) {
		// TODO Auto-generated method stub
		return courseDAO.save(course);
	}

	@Override
	public Courses updatecourse(Courses course) {

		return courseDAO.save(course);
	}

	@Override
	public void deletecourse(long courseId) {

		courseDAO.deleteById(courseId);
	}

}
