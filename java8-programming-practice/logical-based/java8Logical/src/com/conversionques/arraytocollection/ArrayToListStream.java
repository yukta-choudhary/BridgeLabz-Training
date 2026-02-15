package com.conversionques.arraytocollection;
import java.util.*;
import java.util.stream.*;

public class ArrayToListStream {
    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C"};

        List<String> list =
                Arrays.stream(arr)
                      .collect(Collectors.toList());

        System.out.println(list);
    }
}
