package org.example.lv3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    ///  lv2.main 함수에서 관리하던 전체 순서 제어를 이 클래스에서 관리한다.
    //설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
    //MenuItem을 관리하는 리스트가 필드로 존재합니다.
    //main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
    //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.


    /// 클래스 분리를 통해서 확보할 수 있는 장점
    // 클래스 간의 역할 분담                   - 클래스 '분업'
    // 각 클래스 내용의 코드의 간결화           - 클래스 '간결성' 또는 '가독성'
    // 추가 및 보완, 제거의 용이함             - 클래스 '확장성'

    ///  생각해보기
    // Kiosk 클래스에 추가하거나 보완할 수 있는 클래스는 무엇이 있을까?

    /// 클래스 정의
    // 흐름 제어 담당. 프로그램 순서 및 흐름 제어를 담당하는 클래스
    // 사용자 입력 처리 및 메뉴 목록 출력

    // 메뉴 목록
    List<MenuItem> menuItems;
    // 설명 : Kiosk 클래스에서 관리할 목록을 가지고 있어야 하므로 리스트로 필드 선언

    // 입력 스캐너
    Scanner sc1 = new Scanner(System.in);

    ///  생성자??
    // public Kiosk(List<MenuItem> menuItems)
    // Kiosk 객체를 만들 때, 어떤 메뉴를 가지고 와서 시작할지 알려두는 역할.
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;  // 생성 시 메뉴 목록 전달받기
    }


    ///  start 실행 메서드
    // 메뉴를 반복 출력하고 사용자의 입력을 처리하기

    /// public void start() {}
    // Kiosk 시작점 역할
    // lv2 Main 클래스에서 Scanner 기능과, while 반복문, 메뉴 출력과 사용자의 메뉴 입력 그리고 선택 메뉴 출력
    // Main 에서의 기능을 Kiosk 에서 관리

    public void start() {
        while (true) {
            System.out.println("\n[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. %-15s | W %.1f | %s%n", i + 1,
                        menuItems.get(i).getName(),
                        menuItems.get(i).getPrice(),
                        menuItems.get(i).getDescription());
            }

            ///  오류 정리
            // System.out.println("%d. %-15s | W %.1f | %s%n", i + 1, ...);
            // println 단순 문자열 출력 후 줄바꿈
            // printf 포맷 문자열로 주어진 형식에 맞춰 출력

            System.out.println("0. exit           | exit  | 0을 입력시 종료");

            System.out.println("원하는 메뉴를 선택하세요(번호): ");

            try {
                int burgerNumber = sc1.nextInt();   // 기대 : 숫자 입력 / 현실 : 문자 입력 -> 에러

                if (burgerNumber == 0) {
                    System.out.println("메뉴 선택을 종료합니다.");
                    break;
                }

                if (burgerNumber >= 1 && burgerNumber <= menuItems.size()) {
                    MenuItem picked = menuItems.get(burgerNumber - 1);
                        // lv2 에서는 selected / lv3 에서는 picked
                    System.out.printf("선택하신 메뉴: %s | W %.1f | %s%n",
                            picked.getName(),
                            picked.getPrice(),
                            picked.getDescription());
                } else {
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                sc1.nextLine();
            }

            /// InputMismatchException
            //자바에서 입력을 받을 때 Scanner.nextInt(), Scanner.nextDouble() 등으로 숫자를 입력받을 때,
            //사용자가 숫자 대신 문자를 입력하면 이 예외가 발생한다.

            /// 예외 처리하는 방법 try-catch
            //예외가 발생할 수 있는 부분을 try 블록에 넣고,
            //예외 발생 시 처리할 코드를 catch 블록에 작성

            /// catch 문에서 sc1.nextLine(); 사용처
            // try 문에서 nextInt(); 로 예외 발생시 입력값이 남아있어서 이후에도 예외가 발생하므로
            // sc1.nextLine(); 을 통해서 다음 입력이 잘 작동하게 구성

        }

        System.out.println("프로그램을 종료합니다.");
        sc1.close();

    }



}
