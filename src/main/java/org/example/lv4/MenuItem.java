package org.example.lv4;

// 메뉴 하나의 정보를 담는 클래스
public class MenuItem {

    ///  구조예시
    // 이름, 가격, 설명 필드 선언하여 관리
    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.

    ///  검토
    // 메뉴 이름, 가격, 설명 그대로 사용해도??

            /// 입력 순서 확인하기
            // 입력 순서 2
    private final String name;          // 메뉴 이름
    private final double price;         // 메뉴 가격
    private final String description;   // 메뉴 설명

            // 입력 순서 1
    // 생성자 : 객체를 만들 때 값을 설정
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 메뉴 이름 반환
    public String getName() {
        return name;
    }

    // 메뉴 가격 반환
    public double getPrice() {
        return price;
    }

    // 메뉴 설명 반환
    public String getDescription() {
        return description;
    }
}
