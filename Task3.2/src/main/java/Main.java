package main.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale locale = new Locale("en");
        App app = new App(locale);
        app.getQuestions();
        while (input.hasNextInt()){
            int number=input.nextInt();
            if(number==3){
                break;
            }
            System.out.println(app.getAnswer(number));
        }
    }
}
