package org.example.lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
// https://best421.tistory.com/10  Scanner 사용할 때 발생하는 예외 처리 참고
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ///  lv1. MainImprovement 에서 가져옴 - 메뉴 목록

        // Scanner 선언
        Scanner sc1 = new Scanner(System.in);

        /// 메뉴 구성
        // List 선언 및 초기화
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        // (add 보다 더 좋은 방법이 있다면 그렇게 해도 됩니다!)

        /// 메뉴 목록을 배열 (List)로 관리해보기
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "토마토, 양상추, 쉑소스가 토핑된포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        /// 메뉴 선정 반복문
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        // 숫자를 입력 받기
        // 입력된 숫자에 따른 처리
            // 프로그램을 종료
            // 선택한 메뉴 : 이름, 가격, 설명

        // while (true)
        while (true) {
            System.out.println("\n[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. %-15s | W %.1f | %s%n", i + 1,
                        menuItems.get(i).getName(),
                        menuItems.get(i).getPrice(),
                        menuItems.get(i).getDescription());
            }

            /// 코드 분석
            // prinf : print formatted
            // 문자열 안에 있는 포맷 기호(%d, %s 등)에 따라 값을 지정된 형식으로 출력한다

            /// 문자열 안에 있는 포맷 기호
            // %d | %-15s | %.1f | %s | %n
            // %d       |   정수 (숫자) 출력                → i + 1 (메뉴 번호)
            // %-15s    |   왼쪽 정렬된 문자열, 15칸 폭 확보  → item.getName() (메뉴 이름)
            // %.1f     |   소수점 첫째 자리까지 출력하는 실수 → item.getPrice() (가격)
            // %s       |   문자열 출력                    → item.getDescription() (설명)
            // %n       |   줄바꿈 (운영체제에 따라 자동 처리)


            System.out.println("0. exit           | exit  | 0을 입력시 종료");

            System.out.print("원하는 메뉴를 선택하세요(번호): ");

            try {
                int burgerNumber = sc1.nextInt();
                // nextInt -> try catch 비정상 입력 방지
                // 예외처리(InputMismatchException) 정수로 입력해야 하는 데 문자를 입력한 경우 예외 발생

                if (burgerNumber == 0) {
                    System.out.println("메뉴 선택을 종료합니다.");
                    break;  // 루프 종료
                }

                if (burgerNumber >= 1 && burgerNumber <= menuItems.size()) {
                    MenuItem selected = menuItems.get(burgerNumber - 1);
                    System.out.printf("선택하신 메뉴: %s | W %.1f | %s%n",
                            selected.getName(),
                            selected.getPrice(),
                            selected.getDescription());
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");   // 숫자 아닌 문자를 입력한 경우 예외 발생
                sc1.nextLine();
            }
        }

        /// scanner.close() 는 반복문 while 루프 바깥에서 사용하기!
        // 루프 안에서 닫으면, 다음 입력에서 예외 발생
        // 다음 루프에서 sc1.nextInt() 호출할 때, 런타임 에러 발생
        //java.util.NoSuchElementException: No line found
        //java.lang.IllegalStateException: Scanner closed
        System.out.println("프로그램을 종료합니다");
        sc1.close();

    }
}