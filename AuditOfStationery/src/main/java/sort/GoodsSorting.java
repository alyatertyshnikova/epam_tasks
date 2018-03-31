package main.java.sort;

import main.java.audit.Stationery;

import java.util.Comparator;
import java.util.List;

public interface GoodsSorting {
static boolean sortByPrice(List<Stationery>stationeries){
    PriceComparator priceComparator = new PriceComparator();
    stationeries.sort(priceComparator);
    return true;
}
static boolean sortByBrand(List<Stationery>stationeries){
    BrandComparator brandComparator = new BrandComparator();
    stationeries.sort(brandComparator);
    return true;
}
static boolean sortByPriceThenByBrand(List<Stationery>stationeries){
    Comparator<Stationery> hybridComparator=new PriceComparator().thenComparing(new BrandComparator());
    stationeries.sort(hybridComparator);
    return true;
}
}
