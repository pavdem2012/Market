package com.pavdem2012.market;

public class Basket {

    public static void main(String[] args) {
        Product apple = new Product("Iphone", 200, 1, 1000);
        Product mac = new Product("MacBook", 1200, 1, 2000);
        Product android = new Product("HTC", 250, 2, 100);

        apple.addPrice(100);
        mac.addPrice(200);
        android.addPrice(130);

        apple.addWeight(300);
        mac.addWeight(125);
        android.addWeight(200);

        System.out.println("Iphone cost: " + apple.getCost());
        System.out.println("MacBook cost: " + mac.getCost());
        System.out.println("HTC cost: " + android.getCost());

        System.out.println(apple);
        System.out.println(mac);
        System.out.println(android);

        System.out.println(apple.equals(mac));
        System.out.println(mac.equals(android));
        System.out.println(apple.equals(android));
    }
}
