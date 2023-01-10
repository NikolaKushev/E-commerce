package main.java;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double sumOfPriceAndQuantity() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return this.product.toString() + " quantity:" + this.quantity;
    }
}
