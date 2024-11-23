package org.example.model;

public class Bread extends ProductForSale{
    private int count;
    public Bread(String type, int price, String description, int count) {
        super(type, price, description);
        this.count = count;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);

    }

    @Override
    public String toString() {
        return "Bread{" +
                "count=" + count +
                '}';
    }
}
