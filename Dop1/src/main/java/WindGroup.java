package main.java;

//Данный класс кроме метода имеет поля и методы,
//унаследованные от родительского класса MusicalInstrument
public class WindGroup extends MusicalInstrument {

    public WindGroup(String solo, int lengthOfSolo){
        super(solo, lengthOfSolo);
    }

    //Полиморфизм, данный метод вызовется для объекта класса main.java.WindGroup
    public String playAccompaniment() {
        return "Du du";
    }
}
