package org.example.v3;

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

    List<MenuItem> menuItems;
    Scanner scanner = new Scanner(System.in);
}
