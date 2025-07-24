package org.example.lv5;

public class MenuItem {

    private final String name;
    private final double price;
    private final String description;

    /// private 로 접근 차단
    /// final 로 생성 이후 값 변경 불가

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    ///  getName, getPrice 로 읽기 가능

}
