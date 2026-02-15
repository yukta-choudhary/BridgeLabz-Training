package com.conversionques.listtoset;
import java.util.*;

public class MergeListsToSet {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        Set<Integer> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        System.out.println(set);
    }
}
