package com.day2.medinventory;
import java.io.*;
import java.util.*;
import java.util.regex.*;

class MedInventory {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
        String line;

        Set<Item> itemSet = new HashSet<>();
        Map<String, List<Item>> categoryMap = new HashMap<>();

        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            Matcher m = datePattern.matcher(data[3]);

            if (!m.matches()) continue;

            Item item = new Item(data[0], data[1],
                    Integer.parseInt(data[2]), data[3]);

            itemSet.add(item);

            categoryMap.putIfAbsent(data[1], new ArrayList<>());
            categoryMap.get(data[1]).add(item);

            if (item.qty < 5) {
                throw new RuntimeException("Low stock: " + item.name);
            }
        }

        br.close();
        System.out.println("Inventory processed");
    }
}

