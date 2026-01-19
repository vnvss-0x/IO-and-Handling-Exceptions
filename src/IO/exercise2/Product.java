package IO.exercise2;

import java.io.Serializable;

public class Product implements Serializable {
    private long id;
    private String name;
    private String brand;
    private double price;
    private String description;
    private int numberInStock;

    public Product(long id, String name, String brand, double price, String description, int numberInStock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.numberInStock = numberInStock;
    }

    public long getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Brand: " + brand + " | Price: " + price + " | Stock: " + numberInStock;
    }
}