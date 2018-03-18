package main.java.audit;

import main.java.stationerychildren.*;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String surname;
    private ArrayList<Stationery> stationery;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        stationery = new ArrayList<Stationery>();
    }

    public int getPrice() {
        int price = 0;

        for (Stationery i : stationery) {
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

    public void showGoods(){
        for(Stationery i: stationery){
            System.out.format("%s %s - %d rub %d items\n", i.getBrand(), i.getTypeOfStationery(), i.getPrice(),
                    i.numberOfStationeryType);
        }
    }

    public boolean addNewStationary(Stationery newStationery) {
        if (newStationery == null) {
            System.out.println("Inappropriate action");
            return false;
        }
        if (newStationery.getBrand() == null||newStationery.getTypeOfStationery() == null) {
            System.out.println("Inappropriate action");
            return false;
        }
        int index = getIndex(newStationery);
        if (index == -1) {
            stationery.add(newStationery);
        } else {
            stationery.get(index).numberOfStationeryType += newStationery.numberOfStationeryType;
        }
        return true;
    }

    public boolean deleteBoughtStationery(Stationery boughtStationery) {
        int index=getIndex(boughtStationery);
        if(index == -1 ||
                boughtStationery.numberOfStationeryType > stationery.get(index).numberOfStationeryType){
            System.out.println("No more goods");
            return false;
        }

        stationery.get(index).numberOfStationeryType-=boughtStationery.numberOfStationeryType;
        if (stationery.get(index).numberOfStationeryType == 0) {
            stationery.remove(index);
        }
        return true;
    }

    private int getIndex(Stationery o) {
        int index = 0;
        for (Stationery existingStationery : stationery) {
            if (existingStationery.getPrice() == o.getPrice() && existingStationery.getBrand().equals(o.getBrand()) &&
                    existingStationery.getTypeOfStationery().equals(o.getTypeOfStationery())) {
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
        stationery.add(pen);
        stationery.add(pencil);
        stationery.add(notebook);
        stationery.add(eraser);
        stationery.add(redpen);
    }
}
