package model;

public class ProductBai4 {
    private String id;
    private String name;
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductBai4(String description, String id, String name, double price) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductBai4() {
    }
}
