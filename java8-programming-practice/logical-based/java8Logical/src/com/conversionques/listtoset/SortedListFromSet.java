package com.conversionques.listtoset;
import java.util.*;

public class SortedListFromSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(4, 1, 3));

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list);
    }
}
