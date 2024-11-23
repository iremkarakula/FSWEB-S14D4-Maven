package org.example.model;

public class Coke extends ProductForSale{
    private int litre;
    public Coke(String type, int price, String description, int litre) {
        super(type, price, description);
        this.litre = litre;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);

    }

    @Override
    public String toString() {
        return "Coke{" +
                "litre=" + litre +
                '}';
    }
}
