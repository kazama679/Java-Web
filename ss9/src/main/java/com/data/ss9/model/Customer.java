package com.data.ss9.model;

public class Customer {
    private int id;
    private String username;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private String email;

    public Customer() {
    }

    public Customer(String address, String email, String gender, int id, String password, String phone, String username) {
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
