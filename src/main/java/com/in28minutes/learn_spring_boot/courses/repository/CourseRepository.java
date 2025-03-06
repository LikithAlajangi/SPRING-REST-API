package com.in28minutes.learn_spring_boot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learn_spring_boot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
