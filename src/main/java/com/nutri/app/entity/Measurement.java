package com.nutri.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "measurements")
@Data
@NoArgsConstructor
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date measurementDate;
    private Integer neck;
    private Integer waist;
    private Integer hip;
    private Integer abdomen;
    private Integer rightLeg;
    private Integer leftLeg;
    private Integer rightCalf;
    private Integer leftCalf;
    private Integer bodyFat;
    private Integer neckFat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
