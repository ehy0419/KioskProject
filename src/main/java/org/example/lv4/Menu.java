package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

// 메뉴 카테고리를 담을 클래스
public class Menu {
    private List<MenuItem> items;

    //private ArrayList<Object> items;
    // 오류문 : error: incompatible types: ArrayList<Object> cannot be converted to List<MenuItem> return items;
    // items 는 object 타입만 저장할 수 있다고 생각되는 Java 컴파일러는 MenuItem을 넣거나 꺼낼 때 형 변환 오류나 타입 불일치 발생.
    // 형 변환 오류??

    /// List<MenuItem> 또는 ArrayList<MenuItem> 둘 다 가능
    // 일반적으로는 List 인터페이스로 선언하고, ArrayList로 초기화하는 방식이 좋다
    // 유지보수성과 확장성 측면에서.

    private String categoryName;

    ///  Menu 클래스 설명
    //MenuItem 클래스를 관리하는 클래스입니다.
    //예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함합니다.
    //`List<MenuItem>` 은 `Kiosk` 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경합니다.
    //여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 `카테고리 이름` 필드를 갖습니다.
    //메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 합니다.

    ///  구조 예시
    // MenuItem 클래스를 List로 관리
    //
    //		// List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    //		// List를 리턴하는 함수
    //
    //		// 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.

    /// 생성자
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    /// this.items = ....
    // items 는 클래스에 선언된 변수여야 한다.
    /// this
    // 이 클래스에 있는 필드 라는 뜻.  =?? 선언된 변수

    // 메뉴 항목 추가
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 리스트 반환
    public List<MenuItem> getMenuItems() {
        return items;
    }

    /// List<Object>는 List<MenuItem>로 자동 변환되지 않습니다. (반대도 마찬가지)

    ///  타입 불일치 문제
    //private List<Object> items;
    //public List<MenuItem> getMenuItems() {
    //    return items;
    //}
    // 설명 | items는 List<Object> 타입인데, getMenuItems() 메서드는 List<MenuItem>을 반환한다고 되어 있으니,
    // 컴파일러 입장에서는 "Object는 MenuItem이 아닐 수 있다"고 판단해서 오류를 발생


    // 메뉴 항목을 출력하는 메서드
    public void displayMenuItems() {
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s%n",
                    i + 1,
                    item.getName(),
                    item.getPrice(),
                    item.getDescription());
        }
    }

}
