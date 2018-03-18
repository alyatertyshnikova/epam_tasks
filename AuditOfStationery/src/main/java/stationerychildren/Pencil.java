package main.java.stationerychildren;

import main.java.audit.Stationery;

public class Pencil extends Stationery {

    private String color;
    private int hardness;
    private boolean hasItEraser;

    public Pencil(String brand, int price, String typeOfStationery, int numberOfStationeryType, String color,
                  int hardness, boolean hasItEraser) {
        super(brand, price, typeOfStationery, numberOfStationeryType);
        this.color=color;
        this.hardness=hardness;
        this.hasItEraser=hasItEraser;
    }

    public String getColor() {
        return color;
    }

    public int getHardness() {
        return hardness;
    }

    public boolean isHasItEraser() {
        return hasItEraser;
    }
}
