package com.conversionques.listtoset;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
