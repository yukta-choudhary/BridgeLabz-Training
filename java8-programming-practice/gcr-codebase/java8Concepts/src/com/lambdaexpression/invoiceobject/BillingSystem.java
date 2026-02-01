package com.lambdaexpression.invoiceobject;

import java.util.*;
import java.util.stream.*;

public class BillingSystem {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003, 5004);

        
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)  
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
