package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Nutrologist;

public interface INutrologistService {
    void createNutrologist(Nutrologist nutrologist);

    void updateNutrologist(Integer id, Nutrologist nutrologist);

    void deleteNutrologist(Integer id);

    Nutrologist getNutrologist(Integer id);

    List<Nutrologist> getAllNutrologists();
}