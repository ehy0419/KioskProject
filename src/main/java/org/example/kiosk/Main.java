package org.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// 클래스 정의
        // 프로그램 시작 지점이 되는 클래스

        Kiosk kiosk = new Kiosk();

        // 작동 확인
        Scanner scanner = new Scanner(System.in);

        // 메뉴아이템 표시
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");

            System.out.print("원하는 메뉴를 선택하세요(번호): ");
            int burgerNumber = scanner.nextInt();

            if (burgerNumber == 0) {
                System.out.println("메뉴 선택을 종료합니다.");
                break;  // 무한 루프 조심!
            }
            // break - if 문 밖에 있으면 도달할 수 없는 문구 오류 발생

            // 메뉴
            switch (burgerNumber) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;

            }

        }


    }
}
