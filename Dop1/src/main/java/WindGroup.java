package main.java;

public class WindGroup extends MusicalInstruments{

    public WindGroup(String solo, int lengthOfSolo){
        super(solo, lengthOfSolo);
    }

    //Полиморфизм, данный метод вызовется для объекта класса main.java.WindGroup
    public String playAccompaniment() {
        return "Du du";
    }
}
