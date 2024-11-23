package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 15, "chipolata", 5);
        products[1] = new Bread("Bread", 10, "meek", 2);
        products[2] = new Coke("Coke", 20, "kola", 3);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}

