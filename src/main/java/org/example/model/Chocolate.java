package org.example.model;

public class Chocolate extends ProductForSale{
    private int amount;
    public Chocolate(String type, int price, String description, int amount) {
        super(type, price, description);
        this.amount = amount;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);

    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "amount=" + amount +
                '}';
    }
}
