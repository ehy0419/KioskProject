package org.example.lv5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu burgerMenu = new Menu("Burger Menu");
        burgerMenu.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 6.9, "치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 5.4, "기본 비프패티 버거"));

        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

        /// 캡슐화에서 정리
        // 접근 제어자       | private 키워드로 접근에 제한
        // 메서드로 접근 가능 | getXXX(), setXXX() 등으로 안전하게 접근
        // 외부 보호         | 잘못된 값 입력 방지, 무분별한 수정 방지

        // 캡슐화를 하면서 느낀 점
        // 객체의 속성 변수는 외부에서 건드리지 말고, 메서드를 통해서 다루자.

        // lv2를 하면서부터 캡슐화를 다루었는데, 강의 영상에서 다루었던 내용을 토대로 해서 외부에서 접근을 해두는 것을 반영했다.
        // 작성 초기에 접근 제한을 두어야 하는 것을 생각했는데, 개발 초기 단계에서 어떤 자료를 어떻게 접근해야하는지 미리 생각해두는 편이 추후 보완에 힘이 들지 않을 것 같다.

    }
}
