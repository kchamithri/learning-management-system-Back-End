package com.iad.lmsBackend.service;

import com.iad.lmsBackend.dto.request.StudentRequest;
import com.iad.lmsBackend.dto.response.StudentResponse;
import com.iad.lmsBackend.entity.Student;
import com.iad.lmsBackend.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;

    public StudentResponse saveUser(StudentRequest request){
        studentRepository.save(modelMapper.map(request, Student.class));
        StudentResponse response = new StudentResponse();

        response.setResponseCode("00");
        response.setMessage("Saved");
        response.setStatus("Success");
        return response;
    }
}
