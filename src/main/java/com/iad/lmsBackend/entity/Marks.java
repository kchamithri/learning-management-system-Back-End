package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Marks {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "student_no")
    private String studentNo;

    @Column(name = "marks")
    private String marks;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    @OneToMany
    private List<Marks> marksList;

}
