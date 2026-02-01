package com.day2.ecommerce;

import java.util.Optional;

public class EcommerceOptionalDemo {

    public static void main(String[] args) {

        Product p = new Product(null, null, null, null, null);

        // 1. Default discount
        Optional<Integer> discount =
                Optional.ofNullable(p.getDiscount());
        System.out.println("Discount: " +
                discount.orElse(5) + "%");

        // 2. Coupon code
        Optional<String> coupon =
                Optional.ofNullable(p.getCoupon());
        coupon.ifPresent(c ->
                System.out.println("Coupon Applied: " + c));

        // 3. Seller details
        Optional<String> seller =
                Optional.ofNullable(p.getSeller());
        System.out.println("Seller: " +
                seller.orElse("Seller not available"));

        // 4. Description
        Optional<String> desc =
                Optional.ofNullable(p.getDescription());
        System.out.println(desc.orElse("No description available"));

        // 5. Delivery partner
        Optional<String> delivery =
                Optional.ofNullable(p.getDeliveryPartner());
        delivery.ifPresent(d ->
                System.out.println("Delivery Partner: " + d));
    }
}

class Product {
    private Integer discount;
    private String coupon;
    private String seller;
    private String description;
    private String deliveryPartner;

    public Product(Integer discount, String coupon,
                   String seller, String description,
                   String deliveryPartner) {
        this.discount = discount;
        this.coupon = coupon;
        this.seller = seller;
        this.description = description;
        this.deliveryPartner = deliveryPartner;
    }

    public Integer getDiscount() { return discount; }
    public String getCoupon() { return coupon; }
    public String getSeller() { return seller; }
    public String getDescription() { return description; }
    public String getDeliveryPartner() { return deliveryPartner; }
}
