package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "studentMarks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsMarks extends Assignment {

    @Column(name = "marks")
    private double marks;

    @Column(name = "evaluatedDate")
    private Date evaluatedDate;

    @ManyToOne
    private Lecturer lecturer;

    @OneToOne
    private Assignment assignment;

    @ManyToOne
    private Student student;
}
