package com.iad.lmsBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "announcements")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {

    @Id
    @Column(name = "announcementId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int announcementId;

    @Column(name = "description")
    private String description;

    @Column(name = "postDate")
    public String postDate;

    @ManyToOne
    @JoinColumn(name = "lecturer_email")
    private Lecturer lecturer;
}
