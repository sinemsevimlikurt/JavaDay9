package org.example.model;

public class Bread extends ProductForSale{

    private boolean isFluffy;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("type: " + getType() + " price: " + getPrice() + " description: " + getDescription() + "is fluffy: " + isFluffy );
    }
}
