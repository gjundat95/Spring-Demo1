package com.jundat95.springbootstarted.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jundat95.springbootstarted.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService topicService;
	
		@RequestMapping("/topics/{topicId}/courses")
		public List<Course> getAllTopics(@PathVariable String topicId){
			return topicService.getAllCourses(topicId);
		}
		
		@RequestMapping("topics/{topicsId}/courses/{coursesId}")
		public Course getTopic(@PathVariable String topicsId, @PathVariable String coursesId){
			return topicService.getCourse(topicsId,coursesId);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/topics/{topicsId}/courses")
		public void addTopic(@RequestBody Course course, @PathVariable String topicsId){
			course.setTopic(new Topic(topicsId,"",""));
			topicService.addCourse(course);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicsId}/courses/{coursesId}")
		public void updateTopic(@RequestBody Course course, @PathVariable String topicsId){
			course.setTopic(new Topic(topicsId,"",""));
			topicService.updateCourse(course);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicsId}/courses/{coursesId}")
		public void deleteTopic(@PathVariable String coursesId){
			topicService.deleteCourse(coursesId);
		}
		
}
