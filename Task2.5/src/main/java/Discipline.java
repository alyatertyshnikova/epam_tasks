package main.java;

import java.util.HashMap;
import java.util.Map;

public class Discipline<T extends Number> {
    private EducationProgramm name;
    protected Map<Student, T> grades;
    private T defaultGrade;
    private String time;

    public Discipline(EducationProgramm name, String time, T defaultGrade) {
        this.name=name;
        this.time=time;
        this.defaultGrade = defaultGrade;
        grades = new HashMap<>();
    }


    public boolean addNewStudent(Student s) {
        if (s == null) {
            return false;
        }
        if (!grades.containsKey(s)) {
            grades.put(s, defaultGrade);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Student s) {
        if (s == null) {
            return false;
        }
        if (grades.containsKey(s)) {
            grades.remove(s);
            return true;
        }
        return false;
    }

    public boolean rateStudent(Student s, T rate) {
        if (s == null || rate == null) {
            return false;
        }
        if (grades.containsKey(s)) {
            grades.replace(s, rate);
            return true;
        }
        return false;
    }

    public EducationProgramm getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
