package main.java.euDeltaSourceInternship;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int deliveryFee;
    private List<CartItem> cartItems = new ArrayList<>();

    private double calculatePrice() {
        double price = 0;
        for (CartItem cartItem : cartItems) {
            price += cartItem.sumOfPriceAndQuantity();
        }
        return price;
    }

    private double calculateVat() {
        return calculatePrice() * 0.2;
    }

    private double calculateSumWithVat() {
        return calculatePrice() + calculateVat();
    }

    public int calculateDeliveryFee() {
        double sumWithVat= calculateSumWithVat();
        if (cartItems.isEmpty()) {
            deliveryFee = 0;
        }else if (sumWithVat < 100) {
            deliveryFee = 10;
        }else if (sumWithVat < 200) {
            deliveryFee = 5;
        }else {
            deliveryFee = 0;
        }
        return deliveryFee;
    }

    public double calculateFinalPrice() {
        return calculateSumWithVat() + calculateDeliveryFee();
    }

    public void addItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public void removeItem(CartItem cartItem) {
        cartItems.remove(cartItem);
    }

    @Override
    public String toString() {
        return "Total price is: " + calculateFinalPrice() +"lv." + "\nDelivery fee: " + deliveryFee +"lv.";
    }
}

