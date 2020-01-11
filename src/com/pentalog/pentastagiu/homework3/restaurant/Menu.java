package com.pentalog.pentastagiu.homework3.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<String> menuContent;

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, List<String> menuContent) {
        this.name = name;
        this.menuContent = new ArrayList<>();
        this.menuContent.addAll(menuContent);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getMenuContent() {
        List<String> menuContent1 = new ArrayList<>();
        menuContent1.addAll(menuContent);
        return menuContent1;
    }
}
