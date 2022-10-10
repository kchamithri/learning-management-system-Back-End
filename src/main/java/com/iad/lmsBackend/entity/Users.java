package com.iad.lmsBackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {

    @Id
    @Column(name="username")
    private String username;

    @Column(name = "password")
    private String password;

    //Many to many

}
