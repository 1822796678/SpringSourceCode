package com.entites;

/**
 * Created by admin on 2021/11/25.
 */
public class Car {
    private String color;
    private String price;

    public Car() {
    }

    public Car(String color, String price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
