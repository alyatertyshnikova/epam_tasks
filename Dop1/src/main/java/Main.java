package main.java;

public class Main {
    public static void main(String[] args) {
        MusicalInstruments piano = new MusicalInstruments("tududu", 8);
        StringGroup string = new StringGroup("yascripka", 6);
        WindGroup sax = new WindGroup("sax", 5);
        Percusion drum = new Percusion("Bom Bom", 8);
        System.out.println(drum.temp);
        MusicalInstruments.temp = 50;
        System.out.println(drum.temp);
        StringGroup.temp = 60;
        System.out.println(drum.temp);
        System.out.println(string.playAccompaniment());
        System.out.println(piano.playAccompaniment());
        System.out.println(drum.playAccompaniment());
        System.out.println(sax.playSolo());
        System.out.println(string.playSolo());
    }
}
