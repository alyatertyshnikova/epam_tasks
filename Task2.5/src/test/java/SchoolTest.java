package test.java;

import main.java.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolTest {
    private School school;
    private Discipline<Integer>infSec;
    private Student student;

    @Before
    public void setUp(){
        school=new School();
        infSec=new Discipline<>(EducationProgramm.INFORMATIONSECURITY, "3:00", 0);
        student=new Student("name", "surname");
    }

    @Test
    public void addNewDisciplineShouldReturnFalseForNullArgument(){
        assertFalse(school.addNewDiscipline(null));
    }

    @Test
    public void addNewDisciplineShouldAddDisciplineAndReturnTrue(){
        assertTrue(school.addNewDiscipline(infSec));
    }

    @Test
    public void addNewDisciplineShouldAddDisciplineAndReturnTrueEvenIfItAlreadyExistAtSchool(){
        school.addNewDiscipline(infSec);
        assertTrue(school.addNewDiscipline(infSec));
    }

    @Test
    public void deleteDisciplineShouldReturnFalseForNullArgument(){
        assertFalse(school.deleteDiscipline(null));
    }

    @Test
    public void deleteDisciplineShouldReturnFalseIfDisciplineDoesntExist(){
        assertFalse(school.deleteDiscipline(infSec));
    }

    @Test
    public void deleteDisciplineShouldDeleteDisciplineAndReturnTrue(){
        school.addNewDiscipline(infSec);
        assertTrue(school.deleteDiscipline(infSec));
    }

    @Test
    public void showRateShouldReturnFalseForNullArgument(){
        assertFalse(school.showRating(null));
    }

    @Test
    public void showRateShouldPrintStudentsFullNameAllHisDisciplinesAndRatesOrOnlyFullNameAndReturnTrue(){
        assertTrue(school.showRating(student));
    }

}