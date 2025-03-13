package org.example.model;

public class Chocolate extends ProductForSale {

    private String cocoaType;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("type: " + getType() + " price: " + getPrice() + " description: " + getDescription() + "cocoa type: " + cocoaType );
    }


}
