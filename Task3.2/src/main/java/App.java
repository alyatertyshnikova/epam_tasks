package main.java;

import java.util.Iterator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class App {
    private ResourceBundle answers;
    private ResourceBundle questions;

    public App(Locale locale){
        answers=ResourceBundle.getBundle("answers", locale);
        questions=ResourceBundle.getBundle("questions", locale);
    }

    public void getQuestions(){
        Set<String>keys=questions.keySet();
        for(String key:keys){
            System.out.println(questions.getString(key.toString()));
        }
    }

    public String getAnswer(Integer number){
        if(answers.containsKey(number.toString())){
            String answer=answers.getString(number.toString());
            return answer;
        }
        return null;
    }

}
