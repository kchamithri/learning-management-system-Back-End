package com.iad.lmsBackend.controller;

import com.iad.lmsBackend.dto.request.StudentRequest;
import com.iad.lmsBackend.dto.response.StudentResponse;
import com.iad.lmsBackend.repository.StudentRepository;
import com.iad.lmsBackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/lms/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentResponse saveUser(@RequestBody StudentRequest request){
        return studentService.saveUser(request);
    }

}
