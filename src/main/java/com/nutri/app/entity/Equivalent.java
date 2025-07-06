package com.nutri.app.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equivalents")
@Data
@NoArgsConstructor
public class Equivalent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ingredientName;
    private String ingredientType;
    private String quantity;
    private String equivalentScol;

    @ManyToOne
    @JoinColumn(name = "nutrologist_id")
    private Nutrologist nutrologist;
}
