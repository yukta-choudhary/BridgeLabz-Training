package com.conversionques.listtoset;
import java.util.*;

public class SetToList {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");

        List<String> list = new ArrayList<>(set);

        System.out.println(list);
    }
}
