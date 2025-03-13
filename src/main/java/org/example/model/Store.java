package org.example.model;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("ETİ KARAM", 45.6, "LEZİZO");
        ProductForSale coke = new Coke("KOKO", 45.6, "PARIS HILTON");
        ProductForSale bread = new Bread("PİDE", 3.5, "RAMADAN MUBARAQ");

        ProductForSale[] products = {chocolate, coke, bread};

        Store store = new Store();
        store.listProducts(products);
        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}