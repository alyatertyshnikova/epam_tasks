package main.java;

//Данный класс кроме поля numberOfString и 2 методов имеет поля и методы,
//унаследованные от родительского класса MusicalInstrument
public class StringGroup extends MusicalInstrument {
    private int numberOfStrings;

    public StringGroup(String solo, int lengthOfSolo, int numberOfStrings){
        super(solo, lengthOfSolo);
        this.numberOfStrings=numberOfStrings;
    }

    //Полиморфизм, данный метод вызовется для объекта класса main.java.StringGroup
    public String playAccompaniment() {
       return "WeeHee";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
