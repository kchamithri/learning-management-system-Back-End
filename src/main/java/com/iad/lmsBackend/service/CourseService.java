package com.iad.lmsBackend.service;

import com.iad.lmsBackend.dto.request.CourseRequest;
import com.iad.lmsBackend.dto.response.CourseResponse;
import com.iad.lmsBackend.entity.Course;
import com.iad.lmsBackend.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;


    public CourseResponse view(CourseRequest request){
        CourseResponse response = new CourseResponse();

        List<Course> courseList = courseRepository.findCoursesByUserList(request);

        response.setMessage("successfully retrieved");
        response.setStatus("00");
        return response;
    }
}
