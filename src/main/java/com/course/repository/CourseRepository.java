package com.course.repository;

import com.course.data.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course , String> {

    Course getCourseByName(String courseName);
}
