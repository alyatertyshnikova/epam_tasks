package test.java;

import main.java.NuclearPoweredBoat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NuclearPoweredBoatTest {
    private NuclearPoweredBoat nuclearPoweredBoat;

    @Before
    public void setUp(){
        nuclearPoweredBoat=new NuclearPoweredBoat("Super");
    }

    @Test
    public void goToJourneyShouldReturnFalseIfFoundDetalisAreNotEqualDetailsNeededForJourney(){
        assertFalse(nuclearPoweredBoat.goToJourney());
    }

    @Test
    public void goToJourneyShouldReturnTrueForFoundDetailsThatEqualDetailsNeededForJourney(){
        nuclearPoweredBoat.repairDetails(NuclearPoweredBoat.numberOfDetailsNeededForJourney);
        assertTrue(nuclearPoweredBoat.goToJourney());
    }
}