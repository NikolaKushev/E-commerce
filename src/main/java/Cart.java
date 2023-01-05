package main.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int deliveryFee;
    List<CartItem> cartItems;

    public Cart() {
        this.deliveryFee = deliveryFee;
        this.cartItems = new ArrayList<>();
    }

    public double calculatePrice() {//сумира цената без ддс
        double price = 0;
        for (CartItem cartItem : cartItems) {
            price += cartItem.getQuantity() * cartItem.getProduct().getPrice();
        }
        return price;
    }

    public double getDDS() {
        return calculatePrice() * 0.2;
    }

    public double finalPrice() {//сумира крайната цена
        double sumWithDDS = calculatePrice() + getDDS();
        if (sumWithDDS < 100) {
            deliveryFee = 10;
        } else if (sumWithDDS >= 100 && sumWithDDS < 200) {
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
        if(!cartItems.contains(cartItem)) {
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

