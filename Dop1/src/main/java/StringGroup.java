package main.java;

public class StringGroup extends MusicalInstruments {

    public StringGroup(String solo, int lengthOfSolo){
        super(solo, lengthOfSolo);
    }

    //Полиморфизм, данный метод вызовется для объекта класса main.java.StringGroup
    public String playAccompaniment() {
       return "WeeHee";
    }
}
