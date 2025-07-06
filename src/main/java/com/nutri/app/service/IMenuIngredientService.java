package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.MenuIngredient;

public interface IMenuIngredientService {
    void createMenuIngredient(MenuIngredient menuIngredient);

    void updateMenuIngredient(Long id, MenuIngredient menuIngredient);

    void deleteMenuIngredient(Long id);

    MenuIngredient getMenuIngredient(Long id);

    List<MenuIngredient> getAllMenuIngredients();
}
