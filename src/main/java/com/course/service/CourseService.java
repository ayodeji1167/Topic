package com.course.service;

import com.course.data.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();

    Course getByName(String courseName);

    Course addCourse(Course course);


    Course updateCourse(String courseName , Course course );


    void deleteCourse(String courseName);


}
