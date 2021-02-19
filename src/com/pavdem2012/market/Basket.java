package com.pavdem2012.market;

public class Basket {

    public static void main(String[] args) {
        Product apple = new Product("Iphone", 200, 1, 1000);
        Product mac = new Product("MacBook", 1200, 1, 2000);
        Product android = new Product("HTC", 250, 2, 100);

        System.out.println(apple);
        System.out.println(mac);
        System.out.println(android);
    }
}
