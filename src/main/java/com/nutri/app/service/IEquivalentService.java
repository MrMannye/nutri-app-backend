package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Equivalent;

public interface IEquivalentService {
    void createEquivalent(Equivalent equivalent);

    void updateEquivalent(Long id, Equivalent equivalent);

    void deleteEquivalent(Long id);

    Equivalent getEquivalent(Long id);

    List<Equivalent> getAllEquivalents();
}
