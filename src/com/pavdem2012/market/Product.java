package com.pavdem2012.market;

public class Product {
    String name; 
    int weight;
    int category;
    int price;
    
    public Product(String name, int weight, int category, int price) {
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [Наименование:=" + name + ", Вес:=" + weight + ", Категория:=" + category + ", Цена:=" + price + ", Стоимость: = " + weight * price + "]";
    }
}
