package com.nutri.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutri.app.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
