package main.java;

import main.java.audit.Employee;
import main.java.audit.Stationery;
import main.java.sort.StationerySort;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("John", "Brion");
        Stationery pen = new Stationery("Pilot", 1, "pen", 15);
        e.addNewStationary(pen);
        Stationery othPen=new Stationery("Pilot", 30, "pen", 5);
        e.deleteBoughtStationery(othPen);
        e.deleteBoughtStationery(pen);
        e.showGoods();
        e.deleteBoughtStationery(pen);
        StationerySort em=new StationerySort();
        em.createBeginnerSet();
        em.sortByPrice();
        em.sortByBrand();
        em.sortByPriceThenByBrand();
    }
}
