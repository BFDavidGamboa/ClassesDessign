package com.gm.sales;

public class Product {
    private int productId;
    private String name;
    private double price;
    private static int productQuantity;

    private Product(){
        this.productId = ++productQuantity;
    }

    public Product(String name, double price){
        this();
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


