package org.example.lv5;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc2 = new Scanner(System.in);

    private List<Menu> menus;

    ///  menus 는 prviate상태에서는 외부에서 직접 수정 불가

    public Kiosk(List<Menu> menus) {

        this.menus = menus;
    }

    public void start() {

        ///  start 메서드를 통해서만 메뉴를 출력 및 선택할 수 있다
        // 사용자는 내부 구조는 몰라도 이 메서드를 사용해 이용할 수 있다.

        while (true) {

            System.out.println("\n[SHAKESHACK MENU CATEGORIES]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");


            System.out.print("카테고리 번호를 선택하세요: ");
            int categoryChoice;
            try {
                categoryChoice = sc2.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                sc2.nextLine();
                continue;
            }


            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            if (categoryChoice < 1 || categoryChoice > menus.size()) {
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                continue;
            }


            Menu selectedMenu = menus.get(categoryChoice - 1);
            System.out.printf("\n[%s]\n", selectedMenu.getCategoryName());
            selectedMenu.displayMenuItems();
            System.out.println("0. 뒤로 가기");


            System.out.print("메뉴 번호를 선택하세요: ");
            int menuChoice;
            try {
                menuChoice = sc2.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                sc2.nextLine();
                continue;
            }

            if (menuChoice == 0) continue;

            List<MenuItem> items = selectedMenu.getMenuItems();
            if (menuChoice < 1 || menuChoice > items.size()) {
                System.out.println("잘못된 메뉴 선택입니다.");
                continue;
            }


            MenuItem selectedItem = items.get(menuChoice - 1);
            System.out.printf("선택하신 메뉴: %s | W %.1f | %s%n",
                    selectedItem.getName(),
                    selectedItem.getPrice(),
                    selectedItem.getDescription());
        } // while 끝

        sc2.close();
    }
}
