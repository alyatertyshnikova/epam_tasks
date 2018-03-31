import main.java.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Alina", "Alina");
        Student student2=new Student("Ivan", "Ivanov");
        School school=new School();
        Discipline<Integer> math =new Discipline(EducationProgramm.CRYPTOGRAPHY, "10:00", 0);
        Discipline<Double> eng=new Discipline(EducationProgramm.ENGLISH, "11:00", 0);
        school.addNewDiscipline(math);
        school.deleteDiscipline(eng);
        school.addNewDiscipline(eng);
        math.addNewStudent(student1);
        math.addNewStudent(student2);
        math.rateStudent(student1, 5);
        math.rateStudent(student2, 4);
        eng.addNewStudent(student1);
        eng.rateStudent(student1, 4.3);
        school.showRating(student1);
        school.showRating(student2);
    }
}
