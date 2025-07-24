package org.example.lv3;

public class MenuItem {

    private final String name;
    private final double price;
    private final String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 메뉴 이름을 불러오는 메서드
    public String getName() {
        return name;
    }

    // 메뉴 가격을 불러오는 메서드
    public double getPrice() {
        return price;
    }

    // 메뉴 설명을 불러오는 메서드
    public String getDescription() {
        return description;
    }

}
