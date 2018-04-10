package main.java.sort;

import main.java.audit.Stationery;

import java.util.Comparator;

public class BrandComparator implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
