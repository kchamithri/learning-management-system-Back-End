package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "student_marks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsMarks{

    @Column(name = "courseId")
    private String courseId;

    @Id
    @Column(name = "studentId")
    private String studentId;

    @Column(name = "assignmentName")
    private Date assignmentName;

    @Column(name = "marks")
    private double marks;

    @Column(name = "evaluatedDate")
    private Date evaluatedDate;

}
