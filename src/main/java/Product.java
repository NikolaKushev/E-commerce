package main.java;

public class Product {
    private String label;
    private double price;

    public Product(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return label + " " + price;
    }
}
