package com.nutri.app.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingredients")
@Data
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ingredientName;
    private String ingredientType;

    @OneToMany(mappedBy = "ingredient")
    private List<MenuIngredient> menuIngredients;
}
