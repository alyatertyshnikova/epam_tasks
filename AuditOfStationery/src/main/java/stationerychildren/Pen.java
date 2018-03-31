package main.java.stationerychildren;

import main.java.audit.Stationery;

public class Pen extends Stationery {
    private String color;
    private boolean ballPoint;

    public Pen(String brand, int price, String typeOfStationery, int numberOfStationeryType, String color,
               boolean ballPoint) {
        super(brand, price, typeOfStationery, numberOfStationeryType);
        this.color=color;
        this.ballPoint=ballPoint;
    }

    public String getColor() {
        return color;
    }

    public boolean isBallPoint() {
        return ballPoint;
    }
}