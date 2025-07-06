package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Ingredient;

public interface IIngredientService {
    void createIngredient(Ingredient ingredient);

    void updateIngredient(Long id, Ingredient ingredient);

    void deleteIngredient(Long id);

    Ingredient getIngredient(Long id);

    List<Ingredient> getAllIngredients();
}
