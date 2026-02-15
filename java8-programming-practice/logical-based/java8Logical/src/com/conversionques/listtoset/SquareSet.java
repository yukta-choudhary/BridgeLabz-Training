package com.conversionques.listtoset;
import java.util.*;

public class SquareSet {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4);

        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            set.add(i * i);
        }

        System.out.println(set);
    }
}
