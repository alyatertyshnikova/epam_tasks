package main.java;

import main.java.Discipline;

import java.util.LinkedList;

public class School {
    private LinkedList<Discipline>classes;

    public School(){
        classes=new LinkedList<>();
    }

    public boolean addNewDiscipline(Discipline d){
        if(d==null){
            return false;
        }
        classes.add(d);
        return true;
    }

    public boolean deleteDiscipline(Discipline d){
        if(d==null){
            return false;
        }
        if(classes.indexOf(d)==-1){
            return false;
        }
        classes.remove(d);
        return true;
    }

    public boolean showRating(Student s){
        if(s==null){
            return false;
        }
        System.out.println(s.getName()+" "+s.getSurname());
        classes.stream()
                .filter(discipline->discipline.grades.containsKey(s))
                .forEach(discipline -> System.out.println(discipline.getName()+" - "+discipline.grades.get(s)));
        return true;
    }
}
