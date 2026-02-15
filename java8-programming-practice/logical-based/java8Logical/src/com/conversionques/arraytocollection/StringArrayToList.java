package com.conversionques.arraytocollection;
import java.util.*;

public class StringArrayToList {
    public static void main(String[] args) {

        String[] arr = {"Java", "Spring", "API"};

        List<String> list = Arrays.asList(arr);

        System.out.println(list);
    }
}
