package main.java;

import java.util.Scanner;

public class MusicalInstruments {
    public static int temp;
    //Инкапсуляция, к полям, указанным ниже можно обратиться только через определенные методы
    //к solo и lengthOfSolo - через конструктор и playSolo()
    private String solo;
    private int lengthOfSolo;

    public MusicalInstruments(String solo, int lengthOfSolo) {
        this.solo = solo;
        this.lengthOfSolo = lengthOfSolo;
        this.temp=100;
    }

    public MusicalInstruments(String solo, int temp, int lengthOfSolo) {
        this(solo, lengthOfSolo);
        this.temp = temp;
    }

    public String playImprovization() {
        String improvSolo;
        try (Scanner input = new Scanner(System.in)) {
            improvSolo = input.nextLine();
        }
       return playSolo(improvSolo);
    }

    public String playSolo() {
        if (solo.length() < lengthOfSolo) {
            return solo;
        } else {
            return "Your solo too long";
        }
    }

    //Перегрузка метода playSolo()
    //Инкапсуляция, данный метод может быть вызван только в данном классе методом Improvization
    private String playSolo(String improvization) {
        if (improvization.length() < lengthOfSolo) {
            return improvization;
        } else {
            return "Your improvization too long";
        }
    }

    //Полиморфизм, этот метод вызывается в зависимости от класса созданного объекта
    public String playAccompaniment() {
        return "Ta da da dam";
    }


}
