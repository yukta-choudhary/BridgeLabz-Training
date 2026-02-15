package com.conversionques.maptolist;
import java.util.*;
import java.util.stream.*;

class ProductDTO {
    String productName;
    int price;

    ProductDTO(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String toString() {
        return productName + " -> " + price;
    }
}

public class MapToDTOList {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Laptop", 60000);
        map.put("Phone", 30000);

        List<ProductDTO> list =
                map.entrySet()
                   .stream()
                   .map(e -> new ProductDTO(e.getKey(), e.getValue()))
                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
