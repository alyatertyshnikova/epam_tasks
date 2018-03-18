package test.java.sort;

import main.java.sort.StationerySort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationerySortTest {
    private StationerySort e;
    @Before
    public void setUp(){
        e=new StationerySort();
        e.createBeginnerSet();
    }

    @Test
    public void sortByPriceShouldSortCollectionAndReturnTrue(){
        assertTrue(e.sortByPrice());
    }

    @Test
    public void sortByBrandShouldSortCollectionAndReturnTrue(){
        assertTrue(e.sortByBrand());
    }

    @Test
    public void sortByPriceThenByBrandShouldSortCollectionAndReturnTrue(){
        assertTrue(e.sortByPriceThenByBrand());
    }

}