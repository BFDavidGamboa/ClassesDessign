package com.gm.sales;

public class Order {
    private int orderId;
    private Product[] products; //Declared array var
    private static int productQuantity;
    private int productCount;
    private static final int MAX_PRODUCTS = 10;

    public Order() {
        this.orderId = ++productQuantity;
        //Initialize the array
        products = new Product[MAX_PRODUCTS];
    }

    public void aggregateProduct(Product product){
        if(this.productCount < MAX_PRODUCTS){
            products[this.productCount++] = product;
        } else {
            System.out.println("The max quantity of products has been surpassed" + MAX_PRODUCTS );
        }
    }

    public double calculateTotal() {
        double total = 0;
        for(int i =0; i< products.length; i++) {
            Product product = this.products[i];
            total += product.getPrice();
            //total = total + product.getProce();
        }
        return total;
    }

    public void showOrder(){
         System.out.println("Order #: $" + this.calculateTotal());
        System.out.println("Total of the order: $" + this.calculateTotal());
        System.out.println("Products in the order: ");
        for (int i=0 ;i < this.productCount; i++){
            //Implicity it is made the call of the method toString()
            Product product = products[i];
            System.out.println(product);

        }
    }




}
