package com.nutri.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private Integer height;
    private Integer weight;
    private String gender;
    private Date birthday;
    private Integer telephoneNumber;
    private String photoLink;

    @OneToMany(mappedBy = "user")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "user")
    private List<Measurement> measurements;

    @OneToMany(mappedBy = "user")
    private List<Menu> menus;

    @OneToMany(mappedBy = "user")
    private List<Annotation> annotations;
}
