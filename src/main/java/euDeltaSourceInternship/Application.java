package main.java.euDeltaSourceInternship;

public class Application {

    public static void main(String[] args) {

        Product apple = new Product("apple", 3);
        Product carrot = new Product("carrot", 10);
        Product tomato = new Product("tomato", 15);

        CartItem apples = new CartItem(apple, 9);
        CartItem carrots = new CartItem(carrot, 2);
        CartItem tomatoes = new CartItem(tomato, 2);

        Cart cart = new Cart();

        cart.addItem(apples);
        cart.addItem(carrots);
        cart.addItem(tomatoes);

        cart.removeItem(apples);

        cart.calculateFinalPrice();

        System.out.println(cart);
    }
}
