package com.nutri.app.entity;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "blogs")
@Data
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "LONGTEXT")
    private String blogText;

    private Date blogDate;
    private String blogSubject;
    private String blogLink;

    @ManyToOne
    @JoinColumn(name = "nutrologist_id")
    private Nutrologist nutrologist;
}
