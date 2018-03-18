package main.java.audit;

public class Stationery {
    private String brand;
    private int price;
    protected int numberOfStationeryType;
    private String stationeryType;

    public Stationery(String brand, int price, String typeOfStationery, int numberOfStationeryType){
        this.brand=brand;
        this.price=price;
        this.numberOfStationeryType=numberOfStationeryType;
        this.stationeryType=typeOfStationery;
    }

    public int getNumberOfStationeryType() {
        return numberOfStationeryType;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeOfStationery() {
        return stationeryType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
