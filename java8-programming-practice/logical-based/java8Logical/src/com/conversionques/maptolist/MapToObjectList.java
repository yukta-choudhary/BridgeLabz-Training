package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return name + ":" + quantity;
    }
}

public class MapToObjectList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Pen", 10);
        map.put("Book", 5);

        List<Item> list =
                map.entrySet()
                   .stream()
                   .map(e -> new Item(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
