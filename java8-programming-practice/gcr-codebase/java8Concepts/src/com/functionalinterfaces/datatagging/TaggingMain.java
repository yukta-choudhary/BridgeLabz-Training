package com.functionalinterfaces.datatagging;

public class TaggingMain {

    public static void main(String[] args) {

        EncryptionService service = new EncryptionService();

        CustomerDetails customer = new CustomerDetails("John", "1234-5678-9101");
        ProductInfo product = new ProductInfo("Insurance Plan");

        service.process(customer); // encrypted
        service.process(product);  // not encrypted
    }
}
