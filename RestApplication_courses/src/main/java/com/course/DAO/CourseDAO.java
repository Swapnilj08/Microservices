package com.course.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.Courses;

public interface CourseDAO extends JpaRepository<Courses, Long> {

	Courses getById(long courseId);

	void deleteById(long courseId);



	
}
