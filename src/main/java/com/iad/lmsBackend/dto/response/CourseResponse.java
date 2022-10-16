package com.iad.lmsBackend.dto.response;

import com.iad.lmsBackend.entity.Course;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CourseResponse {
    private String status;
    private String message;
    List<Course> courseList;
}
