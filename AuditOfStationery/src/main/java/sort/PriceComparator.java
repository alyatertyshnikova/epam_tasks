package main.java.sort;

import main.java.audit.Stationery;

import java.util.Comparator;

public class PriceComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery o1, Stationery o2) {
        if(o1.getPrice()> o2.getPrice()){
            return 1;
        }
        else if(o1.getPrice()< o2.getPrice()){
            return -1;
        }
        else return 0;
    }
}
