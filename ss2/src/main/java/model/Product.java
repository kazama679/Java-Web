package model;

public class Product {
    private static int idAuto=0;
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public Product() {
        this.id = ++idAuto;
    }

    public Product(String name, double price) {
        this.id = ++idAuto;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
