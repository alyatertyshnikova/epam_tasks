package main.java.stationerychildren;

import main.java.audit.Stationery;

public class Pen extends Stationery {
    private String color;
    private boolean isItBallPoint;

    public Pen(String brand, int price, String typeOfStationery, int numberOfStationeryType, String color,
               boolean isItBallPoint) {
        super(brand, price, typeOfStationery, numberOfStationeryType);
        this.color=color;
        this.isItBallPoint=isItBallPoint;
    }

    public String getColor() {
        return color;
    }

    public boolean isItBallPoint() {
        return isItBallPoint;
    }

}
