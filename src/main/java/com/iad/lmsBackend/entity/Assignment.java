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
public class Assignment {

    @Id
    @Column(name = "file_name")
    private String file_name;

    @Column(name = "subject_id")
    private String subject_id;

    @Column(name = "assignment_name")
    private String assignment_name;

    @Column(name = "assignment_description")
    private String assignment_description;

    @Column(name = "final_submit_date")
    private String final_submit_date;

    @Column(name = "file_type")
    private String file_type;

    @Column(name = "file_size")
    private long file_size;

    @Column(name = "date")
    private String date;

}
