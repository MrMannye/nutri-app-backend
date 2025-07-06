package com.nutri.app.service.impl;

import com.nutri.app.entity.Nutrologist;
import com.nutri.app.repository.NutrologistRepository;
import com.nutri.app.service.INutrologistService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutrologistService implements INutrologistService {

    @Autowired
    NutrologistRepository nutritionistRepository;

    @Override
    public void createNutrologist(Nutrologist nutrologist) {
        nutritionistRepository.save(nutrologist);
    }

    @Override
    public void updateNutrologist(Integer id, Nutrologist nutrologist) {
        Nutrologist existingNutrologist = nutritionistRepository.findById(id).orElse(null);
        if (existingNutrologist != null) {
            existingNutrologist.setName(nutrologist.getName());
            existingNutrologist.setEmail(nutrologist.getEmail());
            nutritionistRepository.save(existingNutrologist);
        }
    }

    @Override
    public void deleteNutrologist(Integer id) {
        nutritionistRepository.deleteById(id);
    }

    @Override
    public Nutrologist getNutrologist(Integer id) {
        Optional<Nutrologist> nutrologist = nutritionistRepository.findById(id);
        return nutrologist.orElse(null);
    }

    @Override
    public List<Nutrologist> getAllNutrologists() {
        return nutritionistRepository.findAll();
    }
}
