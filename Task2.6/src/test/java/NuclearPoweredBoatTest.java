package test.java;

import main.java.NuclearPoweredBoat;
import org.junit.Assert;
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
        nuclearPoweredBoat.engine.setFoundetails(NuclearPoweredBoat.Engine.numberOfDetailsNeededForJourney);
        assertTrue(nuclearPoweredBoat.goToJourney());
    }
}