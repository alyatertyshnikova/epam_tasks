package main.java.stationerychildren;

import main.java.audit.Stationery;

public class Notebook extends Stationery {
    private int numberOfPages;
    private boolean isItASquaredNotebook;

    public Notebook(String brand, int price, String typeOfStationery, int numberOfStationeryType, int numberOfPages,
                    boolean isItASquaredNotebook) {
        super(brand, price, typeOfStationery, numberOfStationeryType);
        this.numberOfPages = numberOfPages;
        this.isItASquaredNotebook = isItASquaredNotebook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isItASquaredNotebook() {
        return isItASquaredNotebook;
    }
}
