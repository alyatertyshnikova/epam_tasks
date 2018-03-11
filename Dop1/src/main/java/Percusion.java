package main.java;

//Данный класс кроме поля hasItPitchOfSound и 2 методов имеет поля и методы,
//унаследованные от родительского класса MusicalInstrument
public class Percusion extends MusicalInstrument {
    private boolean hasItPitchOfSound;

    public Percusion(String solo, int lengthOfSolo, boolean hasItPitchOfSound){
        super(solo, lengthOfSolo);
        this.hasItPitchOfSound=hasItPitchOfSound;
    }

    //Полиморфизм, данный метод вызовется для объекта класса Percussion
    public String playAccompaniment() {
        return "Bam Bam";
    }

    public boolean isHasItPitchOfSound() {
        return hasItPitchOfSound;
    }
}
