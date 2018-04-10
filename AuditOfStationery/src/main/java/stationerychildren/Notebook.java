package main.java.stationerychildren;

import main.java.audit.Stationery;

public class Notebook extends Stationery {
    private int numberOfPages;
    private boolean squaredNotebook;

    public Notebook(String brand, int price, String typeOfStationery, int numberOfStationeryType, int numberOfPages,
                    boolean squaredNotebook) {
        super(brand, price, typeOfStationery, numberOfStationeryType);
        this.numberOfPages = numberOfPages;
        this.squaredNotebook = squaredNotebook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isSquaredNotebook() {
        return squaredNotebook;
    }
}