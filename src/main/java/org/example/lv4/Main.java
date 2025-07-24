package org.example.lv4;

import org.example.lv4_footnoted.Kiosk;
import org.example.lv4_footnoted.Menu;
import org.example.lv4_footnoted.MenuItem;

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

        org.example.lv4_footnoted.Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

    }
}
