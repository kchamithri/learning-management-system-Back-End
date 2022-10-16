package com.iad.lmsBackend.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private String email;
    private String studentId;
    private String name;
    private String gender;
    private String birthday;
    private String mobile;
    private String address;
}
