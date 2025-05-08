package model;

public class Student {
    private String name;
    private int num;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student(String address, String name, int num) {
        this.address = address;
        this.name = name;
        this.num = num;
    }

    public Student() {
    }
}
