package com.pavdem2012.market;

public class Product {
    String name; 
    private double weight = 0;
    int category;
    int price;
    
    public Product(String name, int weight, int category, int price) {
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.price = price;
    }
    public void addWeight(int additinalWight) {
        weight += additinalWight;
    }

    public double getWeight() {
        return weight;
    }
    public void getPrice(int additinalPrice) {
        price += additinalPrice;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", weight=" + weight + ", category=" + category + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + category;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
            return false;
        return true;
    }    
}
