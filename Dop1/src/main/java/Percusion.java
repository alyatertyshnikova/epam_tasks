package main.java;

public class Percusion extends MusicalInstruments {

    public Percusion(String solo, int lengthOfSolo){
        super(solo, lengthOfSolo);
    }

    //Полиморфизм, данный метод вызовется для объекта класса Percussion
    public String playAccompaniment() {
        return "Bam Bam";
    }
}
