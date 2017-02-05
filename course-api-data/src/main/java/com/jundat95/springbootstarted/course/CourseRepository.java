package com.jundat95.springbootstarted.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    /**
     * This is default method, create by Spring Data JPA automatically.
     *
     * @return
     */
    default List<Course> findByTopicId() {
        return findByTopicId();
    }

    //List<Course> findByTopicId(String topicId);

}
