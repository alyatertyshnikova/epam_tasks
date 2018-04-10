package test.java.sort;

import main.java.audit.Employee;
import main.java.sort.GoodsSorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationerySortTest {
    private Employee employee;
    @Before
    public void setUp(){
       employee=new Employee("John", "Brion");
       employee.createBeginnerSet();
    }

    @Test
    public void sortByPriceShouldSortCollectionAndReturnTrue(){
        assertTrue(GoodsSorting.sortByPrice(employee.getStationeries()));
    }

    @Test
    public void sortByBrandShouldSortCollectionAndReturnTrue(){
        assertTrue(GoodsSorting.sortByBrand(employee.getStationeries()));
    }

    @Test
    public void sortByPriceThenByBrandShouldSortCollectionAndReturnTrue(){
        assertTrue(GoodsSorting.sortByPriceThenByBrand(employee.getStationeries()));
    }

}