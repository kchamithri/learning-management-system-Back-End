package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="students_records")
@Table(name = "students_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsRecords {

    @Id
    @Column(name = "student_email")
    private String student_email;

    @Id
    @Column(name = "course_id")
    private String course_id;

    @Column(name = "score")
    private double score;

    @Column(name = "grade")
    private String grade;
}
