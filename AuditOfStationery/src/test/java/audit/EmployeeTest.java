package test.java.audit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import main.java.audit.*;
import main.java.stationerychildren.Pen;

import java.util.LinkedList;

public class EmployeeTest {
    private Employee employee;
    private Stationery pen;

    @Before
    public void setUp() {
        pen = new Stationery("Pilot", 30, "pen", 15);
        employee = new Employee("John", "Lennon");
        employee.addNewStationary(pen);
    }

    @Test
    public void addNewStationeryShouldUpdateListOfStationeryAndReturnTrue() {
        assertTrue(employee.addNewStationary(pen));
    }

    @Test
    public void addNewStationeryShouldReturnFalseForAddingNullObject() {
        assertFalse(employee.addNewStationary(null));
    }

    @Test
    public void deleteBoughtStationeryShouldReturnFalseIfNumberOfRequiredGoodsMore() {
        Stationery bigNumberOfPen=new Stationery("Pilot", 30, "pen", 20);
        assertFalse(employee.deleteBoughtStationery(bigNumberOfPen));
    }

    @Test
    public void deleteBoughtStationeryShouldReturnFalseForNonExistingGoods(){
        Pen redPen=new Pen("RosPechat", 40, "pen",1, "red",
                false);
        assertFalse(employee.deleteBoughtStationery(redPen));
    }

    @Test
    public void deleteBoughtStationeryShouldUpdateListOfStationeryAndReturnTrue() {
        Stationery othPen=new Stationery("Pilot", 30, "pen", 5);
        assertTrue(employee.deleteBoughtStationery(othPen));
    }

    @Test
    public void getPriceShouldReturnSummOfAllElements(){
        assertEquals(450, employee.getPrice());
    }

}
