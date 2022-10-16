package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @Column(name="courseId")
    private String courseId;

    @Column(name = "courseName")
    private String courseName;

    @ManyToMany(mappedBy = "courseList")
    private List<User> userList;

    @OneToMany
    private List<Assignment> assignmentList;

}
