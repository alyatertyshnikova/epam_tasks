package main.java;

import main.java.Discipline;

import java.util.LinkedList;

public class School {
    private LinkedList<Discipline>classes;

    public School(){
        classes=new LinkedList<>();
    }

    public boolean addNewDiscipline(Discipline discipline){
        if(discipline==null){
            return false;
        }
        classes.add(discipline);
        return true;
    }

    public boolean deleteDiscipline(Discipline discipline){
        if(discipline==null){
            return false;
        }
        if(classes.indexOf(discipline)==-1){
            return false;
        }
        classes.remove(discipline);
        return true;
    }

    public boolean showRating(Student student){
        if(student==null){
            return false;
        }
        System.out.println(student.getName()+" "+student.getSurname());
        classes.stream()
                .filter(discipline->discipline.grades.containsKey(student))
                .forEach(discipline -> System.out.println(discipline.getName()+" - "+discipline.grades.get(student)));
        return true;
    }
}
