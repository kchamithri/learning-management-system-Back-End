package com.iad.lmsBackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "assignments")
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Assignment {

    @Id
    @Column(name = "assignmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assignmentId;

    @Column(name = "assignmentName")
    private String assignmentName;

    @Column(name = "assignmentDescription")
    private String assignmentDescription;

    @Column(name = "finalSubmitDate")
    private String finalSubmitDate;

    @Column(name = "date")
    private String date;

    @ManyToOne
    private Course course;

    @OneToOne(fetch = FetchType.LAZY)
    private StudentsMarks studentsMarks;

}
