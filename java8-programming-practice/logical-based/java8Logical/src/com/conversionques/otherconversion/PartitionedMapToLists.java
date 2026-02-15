package com.conversionques.otherconversion;
import java.util.*;
import java.util.stream.*;

public class PartitionedMapToLists {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> map =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenList = map.get(true);
        List<Integer> oddList = map.get(false);

        System.out.println("Even: " + evenList);
        System.out.println("Odd: " + oddList);
    }
}
