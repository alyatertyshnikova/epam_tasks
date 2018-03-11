package main.java;

public class MusicalInstrument {
    public static int temp;
    //Инкапсуляция, к полям, указанным ниже можно обратиться только через определенные методы
    //к solo и lengthOfSolo - через конструктор и playSolo()
    private String solo;
    private int lengthOfSolo;

    public MusicalInstrument(String solo, int lengthOfSolo) {
        this.solo = solo;
        this.lengthOfSolo = lengthOfSolo;
        this.temp = 100;
    }

    public MusicalInstrument(String solo, int temp, int lengthOfSolo) {
        this(solo, lengthOfSolo);
        this.temp = temp;
    }

    public String playImprovization(String improvSolo) {
        if(improvSolo==null) {
            return "Solo improvization can't be null";
        }
        improvSolo = improvSolo + "Solo";
        return playSolo(improvSolo);
    }

    public String playSolo() {
        return solo.length() < lengthOfSolo ? solo : "Your solo too long";
    }

    //Перегрузка метода playSolo()
    //Инкапсуляция, данный метод может быть вызван только в данном классе методом playImprovization
    private String playSolo(String improvization) {
        return (improvization.length() < lengthOfSolo + 4) ?
                improvization : "Your improvization too long";
    }

    //Полиморфизм, этот метод вызывается в зависимости от класса созданного объекта
    public String playAccompaniment() {
        return "Ta da da dam";
    }

}
