package test.java;
import main.java.MusicalInstrument;
import main.java.Percusion;
import main.java.StringGroup;
import main.java.WindGroup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class App {
    private MusicalInstrument[] fineMusicalInstruments;
    private MusicalInstrument[] wrongMusicalInstruments;

    @Before
    public void main(){
        fineMusicalInstruments = new MusicalInstrument[4];
        wrongMusicalInstruments = new MusicalInstrument[4];
        wrongMusicalInstruments[0] = new MusicalInstrument("VeryLongSolo", 4);
        fineMusicalInstruments[0] = new MusicalInstrument("normsolo", 9);
        wrongMusicalInstruments[1] = new StringGroup("VeryLongSolo", 4, 4);
        fineMusicalInstruments[1] = new StringGroup("normsolo", 9, 6);
        wrongMusicalInstruments[2] = new WindGroup("VeryLongSolo", 4);
        fineMusicalInstruments[2] = new WindGroup("normsolo", 9);
        wrongMusicalInstruments[3] = new Percusion("VeryLongSolo", 4, true);
        fineMusicalInstruments[3] = new Percusion("normsolo", 9, false);
    }

    @Test
    public void testPlaySoloShouldReturnErrorStringForStringWithInappropriateLength() {
        for (MusicalInstrument testInstrument : wrongMusicalInstruments) {
            assertEquals("Your solo too long", testInstrument.playSolo());
        }
    }

    @Test
    public void testPlaySoloShouldReturnSolo() {
        for (MusicalInstrument testInstrument : fineMusicalInstruments) {
            assertEquals("normsolo", testInstrument.playSolo());
        }
    }

    @Test
    public void testPlayImprovizationShouldReturnErrorStringForStringWithInappropriateLength() {
        for (MusicalInstrument testInstrument : wrongMusicalInstruments) {
            assertEquals("Your improvization too long",
                    testInstrument.playImprovization("VeryLongImprovization"));
        }
    }

    @Test
    public void testPlayImprovizationShouldReturnImprovization() {
        for (MusicalInstrument testInstrument : fineMusicalInstruments) {
            assertEquals("FineSolo",
                    testInstrument.playImprovization("Fine"));
        }
    }

    @Test
    public void testPlayImprovizationShouldReturnErrorStringForNull() {
        for (MusicalInstrument testInstrument : fineMusicalInstruments) {
            assertEquals("Solo improvization can't be null",
                    testInstrument.playImprovization(null));
        }
    }

    @Test
    public void testPlayAccompanimentShouldReturnStringRelatingTheClassMethod() {
        assertEquals("Ta da da dam", fineMusicalInstruments[0].playAccompaniment());
        assertEquals("WeeHee", fineMusicalInstruments[1].playAccompaniment());
        assertEquals("Du du", fineMusicalInstruments[2].playAccompaniment());
        assertEquals("Bam Bam", fineMusicalInstruments[3].playAccompaniment());
    }
}