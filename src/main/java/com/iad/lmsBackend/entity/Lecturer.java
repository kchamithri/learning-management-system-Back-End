package com.iad.lmsBackend.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lecturer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lecturer {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile")
    private String mobile;

    @OneToMany
    private List<Course> courseList;

    @OneToMany
    private List<Announcement> announcementList;

    @OneToMany
    private List<StudentsMarks> studentsMarksList;
}
