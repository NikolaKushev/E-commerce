package main.java;

public class Application {
    public static void main(String[] args) {
        Product apple=new Product("apple",3);
        Product carrot=new Product("carrot",17.8);
        Product tomato=new Product("tomato",40);

        CartItem apples=new CartItem(apple,9);
        CartItem carrots=new CartItem(carrot,6);
        CartItem tomatoes=new CartItem(tomato,27);

        Cart cart=new Cart();

        cart.addItem(apples);
        cart.addItem(carrots);
        cart.addItem(tomatoes);
        cart.removeItem(apples);
        cart.removeItem(carrots);
        cart.finalPrice();
        System.out.println(cart.toString());
    }
}
