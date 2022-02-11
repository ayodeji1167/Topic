package com.course.controller;


import com.course.data.Course;
import com.course.service.CourseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseServiceImplementation courseServiceImplementation;


    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseServiceImplementation.getCourses();
    }

    @GetMapping("/courses/{name}")
    public Course getCourseByName(@PathVariable String name){
        return courseServiceImplementation.getByName(name);
    }

    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course course){
        return courseServiceImplementation.addCourse(course);
    }

    @PutMapping("/courses/{name}")
    public Course updateCourse(@PathVariable String name, @RequestBody Course course){
        return courseServiceImplementation.updateCourse(name, course);
    }

    @DeleteMapping("/courses/{name}")
    public void deleteCourse(@PathVariable String  name){

        courseServiceImplementation.deleteCourse(name);
    }


}
