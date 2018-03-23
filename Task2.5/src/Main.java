import main.java.*;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("Alina", "Alina");
        Student s1=new Student("Ivan", "Ivanov");
        School sc=new School();
        Discipline<Integer> math =new Discipline(EducationProgramm.CRYPTOGRAPHY, "10:00", 0);
        Discipline<Double> eng=new Discipline(EducationProgramm.ENGLISH, "11:00", 0);
        sc.addNewDiscipline(math);
        sc.deleteDiscipline(eng);
        sc.addNewDiscipline(eng);
        math.addNewStudent(s);
        math.addNewStudent(s1);
        math.rateStudent(s, 5);
        math.rateStudent(s1, 4);
        eng.addNewStudent(s);
        eng.rateStudent(s, 4.3);
        sc.showRating(s);
        sc.showRating(s1);
    }
}
