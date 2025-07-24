package org.example.lv4;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// 전체 흐름을 관장하는 클래스
public class Kiosk {
    private List<Menu> menus;

    ///  구조 예시
    //start() {
    //			// 스캐너 선언
    //			// 반복문 시작
    //
    //			// List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
    //
    //			// 숫자 입력 받기
    //
    //			// 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
    //				// List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
    //
    //			// Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
    //
    //			// 숫자 입력 받기
    //			// 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
    //				// menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
    //		}

    Scanner sc2 = new Scanner(System.in);

    /// 생성자 : 메뉴 카테고리들을 전달 받기
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 키오스크 실행 메서드
    public void start() {
        while (true) {
            // 1단계: 카테고리 출력
            System.out.println("\n[SHAKESHACK MENU CATEGORIES]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            // 사용자 입력 받기
            System.out.print("카테고리 번호를 선택하세요: ");
            int categoryChoice;
            try {
                categoryChoice = sc2.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                sc2.nextLine();  // 버퍼 정리
                continue;
            }

            // 종료 선택 시 반복문 탈출
            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 선택 번호가 유효한지 검사
            if (categoryChoice < 1 || categoryChoice > menus.size()) {
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                continue;
            }

            // 2단계: 선택한 카테고리 메뉴 보여주기
            Menu selectedMenu = menus.get(categoryChoice - 1);
            System.out.printf("\n[%s]\n", selectedMenu.getCategoryName());
            selectedMenu.displayMenuItems();
            System.out.println("0. 뒤로 가기");

            // 메뉴 선택 입력 받기
            System.out.print("메뉴 번호를 선택하세요: ");
            int menuChoice;
            try {
                menuChoice = sc2.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                sc2.nextLine();  // 버퍼 정리
                continue;
            }

            if (menuChoice == 0) continue;

            List<MenuItem> items = selectedMenu.getMenuItems();
            if (menuChoice < 1 || menuChoice > items.size()) {
                System.out.println("잘못된 메뉴 선택입니다.");
                continue;
            }

            // 선택한 메뉴 출력
            MenuItem selectedItem = items.get(menuChoice - 1);
            System.out.printf("선택하신 메뉴: %s | W %.1f | %s%n",
                    selectedItem.getName(),
                    selectedItem.getPrice(),
                    selectedItem.getDescription());
        }

        sc2.close();  // 스캐너 닫기
    }

}
