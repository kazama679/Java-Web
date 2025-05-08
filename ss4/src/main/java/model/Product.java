package model;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(String description, int id, double price, String productName) {
        this.description = description;
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public Product() {
    }
}