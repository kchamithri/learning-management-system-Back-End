package com.iad.lmsBackend.controller;

import com.iad.lmsBackend.dto.request.CourseRequest;
import com.iad.lmsBackend.dto.response.CourseResponse;
import com.iad.lmsBackend.repository.CourseRepository;
import com.iad.lmsBackend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*" ,  allowedHeaders = "*")
@RequestMapping("/auth/course")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseService courseService;

    @PostMapping("/view")
    public CourseResponse findCourses(@RequestBody CourseRequest request){
        return courseService.view(request);
    }
}
