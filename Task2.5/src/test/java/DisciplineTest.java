package test.java;

import main.java.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisciplineTest {
    private Student student;
    private Discipline<Integer> testing;

    @Before
    public void setUp() {
        student = new Student("name", "surname");
        testing = new Discipline<>(EducationProgramm.TESTING, "13:00", 0);
    }

    @Test
    public void addNewStudentShouldReturnFalseForNullArguments() {
        assertFalse(testing.addNewStudent(null));
    }

    @Test
    public void addStudentShouldReturnFalseIfStudentAlreadyExists(){
        testing.addNewStudent(student);
        assertFalse(testing.addNewStudent(student));
    }

    @Test
    public void addStudentShouldAddStudentToDisciplineAndReturnTrue(){
        assertTrue(testing.addNewStudent(student));
    }

    @Test
    public void rateStudentShouldReturnFalseForNullArgument(){
        assertFalse(testing.rateStudent(null, null));
        assertFalse(testing.rateStudent(null, 5));
        assertFalse(testing.rateStudent(student, null));
    }

    @Test
    public void rateStudentShouldReturnFalseIfStudentDoesntExist(){
        assertFalse(testing.rateStudent(student, 5));
    }

    @Test
    public void rateStudentShouldUpdateStudentsRateAndReturnTrue(){
        testing.addNewStudent(student);
        assertTrue(testing.rateStudent(student, 5));
    }

    @Test
    public void deleteStudentShouldReturnFalseForNullArgument(){
        assertFalse(testing.deleteStudent(null));
    }

    @Test
    public void deleteStudentShouldReturnFalseIfStudentDoesntExist(){
        assertFalse(testing.deleteStudent(student));
    }

    @Test
    public void deleteStudentShouldDeleteStudentFromDisciplineAndReturnTrue(){
        testing.addNewStudent(student);
        assertTrue(testing.deleteStudent(student));
    }

}