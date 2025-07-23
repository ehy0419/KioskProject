package org.example.v3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    ///  lv3 작업 순서
    /// Kiosk 클래스 생성
    //menuItems 리스트가 필드로 존재
    //start() 메서드에서 main 함수에서 입력과 반복문 로직 관리
    /// Main 클래스 단순화
    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당

    ///  무슨 말이지...
    //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다. -

    /// 클래스 정의
    // 프로그램 시작 지점이 되는 클래스
    // 메뉴 목록 생성 후 kisok 실행

    public static void main(String[] args) {

        // 메뉴 목록
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 메뉴 목록 직접 타이핑
        // lv2 main에서 복붙하면
//        List<org.example.lv2.MenuItem> menuItems = new ArrayList<>();
//        menuItems.add(new org.example.lv2.MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
//        menuItems.add(new org.example.lv2.MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
//        menuItems.add(new org.example.lv2.MenuItem("Cheeseburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
//        menuItems.add(new org.example.lv2.MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Kiosk 객체 생성 후 start() 함수 생성
        // start 메서드 추가
        // Kiosk 클래스에도 같은 생성자 만들기!
    }
}
