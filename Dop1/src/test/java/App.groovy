package test.java

import main.java.MusicalInstruments
import main.java.Percusion
import main.java.StringGroup
import main.java.WindGroup
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals;

public class App extends GroovyTestCase {

    private MusicalInstruments piano;
    private MusicalInstruments accordion;
    private StringGroup cello;
    private StringGroup violin;
    private WindGroup sax;
    private WindGroup harmonica;
    private Percusion drum;
    private Percusion spoons;

  @Before
    public void setUp() {
        piano = new MusicalInstruments("VeryLongSolo", 4);
        accordion = new MusicalInstruments("normsolo", 9);
        cello = new StringGroup("VeryLongSolo", 4);
        violin = new StringGroup("normsolo", 9);
        sax = new WindGroup("VeryLongSolo", 4);
        harmonica = new WindGroup("normsolo", 9);
        drum = new Percusion("VeryLongSolo", 4);
        spoons = new Percusion("normsolo", 9);
    }

    @Test
    public void testPlaySoloShouldReturnStringAboutLengthForStringWithInappropriateLength() {
        assertEquals("Your solo too long", cello.playSolo());
        assertEquals("Your solo too long", piano.playSolo());
        assertEquals("Your solo too long", sax.playSolo());
        assertEquals("Your solo too long", drum.playSolo());
    }

    /*@Test
    public void playImprovizationShouldReturnStringAboutLengthForStringWithInappropriateLength(){
        assertEquals("Your improvization too long", piano.playImprovization());
    }*/

    @Test
    public void testPlaySoloShouldReturnSolo() {
        assertEquals("normsolo", violin.playSolo());
        assertEquals("normsolo", accordion.playSolo());
        assertEquals("normsolo", harmonica.playSolo());
        assertEquals("normsolo", spoons.playSolo());
    }

    @Test
    public void testPlayAccompanimentShouldReturnStringRelatingTheClassMethod() {
        assertEquals("Ta da da dam", piano.playAccompaniment());
        assertEquals("Bam Bam", spoons.playAccompaniment());
        assertEquals("Du du", sax.playAccompaniment());
        assertEquals("WeeHee", violin.playAccompaniment());
    }
}
