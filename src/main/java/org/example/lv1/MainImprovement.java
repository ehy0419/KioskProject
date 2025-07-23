package org.example.lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainImprovement {

    public static void main(String[] args) {

        ///  lv1. Main 을 개선

        // Scanner
        Scanner sc1 = new Scanner(System.in);

        // While
        while (true) {
            System.out.println("[SHAKESHACK MENU]");
            System.out.println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack     | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger   | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger      | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. exit           | exit  | 0을 입력시 종료");

            System.out.print("원하는 메뉴를 선택하세요(번호): ");

            try {
                int burgerNumber = sc1.nextInt();
                // nextInt -> try catch 비정상 입력 방지
                // 예외처리(InputMismatchException) 정수로 입력해야 하는 데 문자를 입력한 경우 예외 발생

                if (burgerNumber == 0) {
                    System.out.println("메뉴 선택을 종료합니다.");
                    break;
                }


                // 메뉴
                switch (burgerNumber) {
                    case 1:
                        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                        break;
                    case 2:
                        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                        break;
                    case 3:
                        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                        break;
                    case 4:
                        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                        break;
                    default:
                        System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }

            }

            catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");   // 숫자 아닌 문자를 입력한 경우 예외 발생
                sc1.nextLine();
            }

        }


        System.out.println("프로그램을 종료합니다");
        sc1.close();
    }
}
