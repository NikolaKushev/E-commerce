package main.java;

public class Product {
    private String label;
    private double price;

    public Product(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getData() {
        return label+ " "+ price;
    }//извежда информация за името и цената на продукта

    public double getPrice() {
        return price;
    }

    public String getLabel() {
        return label;
    }
}
