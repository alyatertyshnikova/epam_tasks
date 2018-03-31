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


    public boolean addNewStudent(Student student) {
        if (student == null) {
            return false;
        }
        if (!grades.containsKey(student)) {
            grades.put(student, defaultGrade);
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Student student) {
        if (student == null) {
            return false;
        }
        if (grades.containsKey(student)) {
            grades.remove(student);
            return true;
        }
        return false;
    }

    public boolean rateStudent(Student student, T rate) {
        if (student == null || rate == null) {
            return false;
        }
        if (grades.containsKey(student)) {
            grades.replace(student, rate);
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
