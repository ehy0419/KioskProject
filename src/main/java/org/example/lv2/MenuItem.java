package org.example.lv2;

public class MenuItem {
    private final String name;
    private final double price;
    private final String description;

    ///  MainItem 클래스 생성하기
    // 설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    // 클래스는 이름, 가격, 설명 필드를 갖습니다.

    ///  메뉴 정보를 하드코딩하지 말고 구조화할 것
    // 문제점 : 메뉴 정보를 문자열로 직접 System.out.println()에 넣으면 나중에 수정하기 어렵다.
    // 개선안 : MenuItem 클래스를 만들어 구조화 해보자.

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
