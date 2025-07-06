package com.nutri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutri.app.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

}
