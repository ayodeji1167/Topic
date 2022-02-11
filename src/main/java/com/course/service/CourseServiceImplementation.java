package com.course.service;

import com.course.data.Course;
import com.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImplementation implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Course getByName(String courseName) {
        return courseRepository.getCourseByName(courseName);
    }

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(String courseName, Course course) {
        course.setName(courseName);
        return courseRepository.save(course);
    }

    public void deleteCourse(String courseName) {

        courseRepository.getById(courseName);

    }
}
