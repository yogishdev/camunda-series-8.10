package com.yogishdev.P4.Create.a.Spring.Boot.Camunda.Project.model;

public class Order {
    private String orderId;
    private double amount;

    // Default Constructor
    public Order() {}

    // Getters and Setters
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}

