package main.java.audit;

import main.java.stationerychildren.*;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private List<Stationery> stationeries;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        stationeries = new ArrayList<Stationery>();
    }

    public List<Stationery> getStationeries() {
        return stationeries;
    }

    public int getPrice() {
        int price = 0;

        for (Stationery i : stationeries) {
            price += i.getPrice() * i.getNumberOfStationeryType();
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void showGoods() {
        for (Stationery i : stationeries) {
            System.out.format("%s %s - %d rub %d items\n", i.getBrand(), i.getTypeOfStationery(), i.getPrice(),
                    i.numberOfStationeryType);
        }
    }

    public boolean addNewStationary(Stationery newStationery) {
        if (newStationery == null) {
            System.out.println("Inappropriate action");
            return false;
        }
        if (newStationery.getBrand() == null || newStationery.getTypeOfStationery() == null) {
            System.out.println("Inappropriate action");
            return false;
        }
        int index = getIndex(newStationery);
        if (index == -1) {
            stationeries.add(newStationery);
        } else {
            stationeries.get(index).numberOfStationeryType += newStationery.numberOfStationeryType;
        }
        return true;
    }

    public boolean deleteBoughtStationery(Stationery boughtStationery) {
        int index = getIndex(boughtStationery);
        if (index == -1 ||
                boughtStationery.numberOfStationeryType > stationeries.get(index).numberOfStationeryType) {
            System.out.println("No more goods");
            return false;
        }

        stationeries.get(index).numberOfStationeryType -= boughtStationery.numberOfStationeryType;
        if (stationeries.get(index).numberOfStationeryType == 0) {
            stationeries.remove(index);
        }
        return true;
    }

    private int getIndex(Stationery wantedStationery) {
        int index = 0;
        for (Stationery existingStationery : stationeries) {
            if (existingStationery.getPrice() == wantedStationery.getPrice() &&
                    existingStationery.getBrand().equals(wantedStationery.getBrand()) &&
                    existingStationery.getTypeOfStationery().equals(wantedStationery.getTypeOfStationery())) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void createBeginnerSet() {
        Pen pen = new Pen("RosPechat", 40, "pen", 100, "blue",
                false);
        Pencil pencil = new Pencil("EricKhrauser", 25, "pencil", 100,
                "gray", 2, true);
        Notebook notebook = new Notebook("NoteBrand", 50, "notebook", 40,
                48, false);
        Stationery eraser = new Stationery("BestErasers", 30, "eraser", 20);
        Pen redpen = new Pen("pilot", 45, "pen", 40, "red",
                true);
        stationeries.add(pen);
        stationeries.add(pencil);
        stationeries.add(notebook);
        stationeries.add(eraser);
        stationeries.add(redpen);
    }
}