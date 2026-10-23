package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private boolean isActive;
    private Address address;       // Nested Object
    private List<Order> orders;    // Array of Objects

    // Default Constructor
    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                ", address=" + address +
                ", orders=" + orders +
                '}';
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isIsActive() { return isActive; }
    public void setIsActive(boolean isActive) { this.isActive = isActive; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
}

