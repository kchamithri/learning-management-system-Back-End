package com.iad.lmsBackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
public class Course {

    @Id
    @Column(name="courseId")
    private String courseId;

    @Column(name = "courseName")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "lecturer_email")
    private Lecturer lecturer;

    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList;

}
