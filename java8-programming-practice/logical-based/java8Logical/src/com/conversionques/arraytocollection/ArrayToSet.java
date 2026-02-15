package com.conversionques.arraytocollection;
import java.util.*;

public class ArrayToSet {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 2, 3};

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));

        System.out.println(set);
    }
}
