package model;

public class Studentbai6 {
    private int id;
    private String name;
    private int age;
    private double avgPoint;

    public Studentbai6() {
    }

    public Studentbai6(int age, double avgPoint, int id, String name) {
        this.age = age;
        this.avgPoint = avgPoint;
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
