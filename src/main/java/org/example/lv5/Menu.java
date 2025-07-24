package org.example.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items;

    ///  items 외부에서 접근 불가
    /// addItem() 메서드로 추가 가능

    private String categoryName;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return items;
    }

    /// getMenuItems 읽기 가능
    /// 수정할 때는.. 조심

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
