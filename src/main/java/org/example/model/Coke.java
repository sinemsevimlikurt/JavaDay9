package org.example.model;

public class Coke extends  ProductForSale{

    private String mouseBlood;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("type: " + getType() + " price: " + getPrice() + " description: " + getDescription() + "mouse blood " + mouseBlood );
    }

}
