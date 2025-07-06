package com.nutri.app.service;

import java.util.List;

import com.nutri.app.entity.Menu;

public interface IMenuService {
    void createMenu(Menu menu);

    void updateMenu(Long id, Menu menu);

    void deleteMenu(Long id);

    Menu getMenu(Long id);

    List<Menu> getAllMenus();
}