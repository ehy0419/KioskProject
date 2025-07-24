package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ///  구조 예시
        // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입

        // Kiosk 객체 생성
        // Kiosk 내 시작하는 함수 호출

        // 1. 버거 메뉴 카테고리 만들기
        Menu burgerMenu = new Menu("Burger Menu");

        // 2. 메뉴 항목 추가하기
        burgerMenu.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 6.9, "치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 5.4, "기본 비프패티 버거"));

        ///  기존 List<MenuItem>
        // | 메뉴들이 전부 하나의 리스트에 있음 → 카테고리 없음
        // 장점
        // 단순한 코드
        // 빠른 메뉴 구성

        // 단점
        // 메뉴 카테고리(버거, 음료 등)를 구분 불가
        // 모든 메뉴가 한 리스트에 있어 단조로운 구조
        // 확장하기 어려움 (예: 카테고리별 출력이 안 됨).

        ///  개선 List<Menu> 클래스 도입 후 카테고리화
        // | Menu 하나가 여러 MenuItem을 가짐 → 카테고리별 메뉴 구조 가능
        // 장점
        // 카테고리 구분 | 각 Menu 객체가 버거, 음료, 디저트 등 역할을 가짐
        // 확장성       | 여러 Menu를 List<Menu>에 담아서 선택 구조로 확장 가능
        // 코드 가독성   | 어떤 메뉴가 어떤 카테고리에 속하는지 명확
        // 객체 지향    | 역할별 클래스를 분리해 책임을 나눔 (단일 책임 원칙 적용)

        // 3. 메뉴 리스트(카테고리들)에 추가 (추후 음료 메뉴 등도 추가 가능)
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu); // 이후 음료 등 추가 가능

        // 4. Kiosk 실행
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

    }
}
