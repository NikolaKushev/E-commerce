package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int deliveryFee;
    private List<CartItem> cartItems=new ArrayList<>();

    private double calculatePrice() {
        double price = 0;
        for (CartItem cartItem : cartItems) {
            price += cartItem.sumOfPriceAndQuantity();
        }
        return price;
    }

    private double getDDS() {
        return calculatePrice() * 0.2;
    }

    public double finalPrice() {
        double sumWithDDS = calculatePrice() + getDDS();
        if (sumWithDDS < 100) {
            deliveryFee = 10;
        } else if (sumWithDDS < 200) {
            deliveryFee = 5;
        } else {
            deliveryFee = 0;
        }
        return sumWithDDS + deliveryFee;
    }

    public void addItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public void removeItem(CartItem cartItem) {

        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty");
        }
        if (!cartItems.contains(cartItem)) {
            System.out.println("Item not in cart");
        }
        cartItems.remove(cartItem);
        System.out.println("Item removed: " + cartItem.getProduct().getLabel());
    }

    @Override
    public String toString() {
        return "total price is: " + finalPrice() + "\ndelivery fee:" + deliveryFee;
    }
}

