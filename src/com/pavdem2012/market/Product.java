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
        return "Product [Наименование:=" + name + ", Вес:=" + weight + ", "
                + "Категория:=" + category + ", Цена:=" + price + ", "
                + "Стоимость: = " + weight * price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + category;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (category != other.category)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }
    
}
