package com.jundat95.springbootstarted.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> listCourse = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(listCourse::add);
        return listCourse;
    }

    public Course getCourse(String topicsId, String coursesId) {
        return courseRepository.findOne(coursesId);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }

}
