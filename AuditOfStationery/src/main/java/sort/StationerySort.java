package main.java.sort;

import main.java.stationerychildren.*;
import main.java.audit.*;

import java.util.ArrayList;
import java.util.Comparator;

public class StationerySort implements GoodsSorting {
    private ArrayList<Stationery> stationery = new ArrayList<Stationery>();
    PriceComparator priceComparator = new PriceComparator();
    BrandComparator brandComparator = new BrandComparator();
    Comparator<Stationery> hybridComparator=new PriceComparator().thenComparing(new BrandComparator());

    @Override
    public boolean sortByPrice() {
        stationery.sort(priceComparator);
        return true;
    }

    @Override
    public boolean sortByBrand() {
        stationery.sort(brandComparator);
        return true;
    }

    @Override
    public boolean sortByPriceThenByBrand() {
        stationery.sort(hybridComparator);
        return true;
    }

    public void createBeginnerSet() {
        Pen pen = new Pen("RosPechat", 40, "pen", 100, "blue",
                false);
        Pencil pencil = new Pencil("EricKhrauser", 25, "pencil", 100,
                "gray", 2, true);
        Notebook notebook = new Notebook("NoteBrand", 50, "notebook", 40,
                48, false);
        Stationery eraser = new Stationery("BestErasers", 30, "eraser", 20);
        Pen bluepen = new Pen("pilot", 50, "pen", 40, "blue",
                true);
        Pen redpen = new Pen("pilot", 45, "pen", 40, "red",
                true);
        stationery.add(pen);
        stationery.add(pencil);
        stationery.add(notebook);
        stationery.add(eraser);
        stationery.add(bluepen);
        stationery.add(redpen);
    }
}
