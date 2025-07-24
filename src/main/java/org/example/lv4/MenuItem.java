package org.example.lv4;

public class MenuItem {

    ///  구조예시
    // 이름, 가격, 설명 필드 선언하여 관리
    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.

    ///  검토
    // 메뉴 이름, 가격, 설명 그대로 사용해도??

            /// 입력 순서 확인하기
            // 입력 순서 2
    private final String name;
    private final double price;
    private final String description;

            // 입력 순서 1
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
}
