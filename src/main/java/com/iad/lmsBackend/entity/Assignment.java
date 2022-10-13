package com.iad.lmsBackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "assignments")
@Getter
@Setter
@NoArgsConstructor
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
    private Date date;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
