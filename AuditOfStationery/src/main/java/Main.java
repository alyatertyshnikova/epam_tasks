package main.java;

import main.java.audit.Employee;
import main.java.audit.Stationery;
import main.java.sort.GoodsSorting;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brion");
        Stationery pen = new Stationery("Pilot", 1, "pen", 15);
        employee.addNewStationary(pen);
        Stationery othPen=new Stationery("Pilot", 30, "pen", 5);
        employee.deleteBoughtStationery(othPen);
        employee.deleteBoughtStationery(pen);
        employee.showGoods();
        employee.deleteBoughtStationery(pen);
        employee.createBeginnerSet();
        GoodsSorting.sortByBrand(employee.getStationeries());
        GoodsSorting.sortByPrice(employee.getStationeries());
        GoodsSorting.sortByPriceThenByBrand(employee.getStationeries());
    }
}