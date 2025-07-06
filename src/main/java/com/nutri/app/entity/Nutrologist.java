package com.nutri.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "nutrologists")
@Data
@NoArgsConstructor
public class Nutrologist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String lastName;
    private Integer professionalId;
    private String email;
    private String password;
    private String link1;
    private String link2;
    private String link3;
    private Integer telephoneNumber;
    private String photoLink;

    @OneToMany(mappedBy = "nutrologist")
    private List<Appointment> appointments;

    @OneToMany(mappedBy = "nutrologist")
    private List<Annotation> annotations;

    @OneToMany(mappedBy = "nutrologist")
    private List<Blog> blogs;

    @OneToMany(mappedBy = "nutrologist")
    private List<Equivalent> equivalents;
}
