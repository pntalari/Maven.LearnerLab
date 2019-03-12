package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testEducatorConstructor(){
        Educator leon = Educator.LEON;
        Educator froilan = Educator.FROILAN;
        Educator nhu = Educator.NHU;
        Educator wilhem = Educator.WILHEM;

        String expectedName1 = "LEON";
        String expectedName2 = "FROILAN";
        String expectedName3 = "NHU";
        String expectedName4 = "WILHEM";

        Assert.assertEquals(expectedName1,leon.getInstructor().getName());
        Assert.assertEquals(expectedName2,froilan.getInstructor().getName());
        Assert.assertEquals(expectedName3,nhu.getInstructor().getName());
        Assert.assertEquals(expectedName4,wilhem.getInstructor().getName());

    }

    @Test
    public void teachTest() {
        Educator leon = Educator.LEON;
        double noOfHrs = 50;
        Student stud1 = new Student(50L);
        leon.teach(stud1, noOfHrs);
        double actualHours = leon.getTimeWorked();
        Assert.assertEquals(noOfHrs,actualHours,0);
    }

    @Test
    public void lectureTest() {
        Educator wilhem = Educator.WILHEM;
        double noOfHrsStud1 = 80;
        double noOfHrsStud2 = 50;
        Student stud1 = new Student(50L);
        Student stud2 = new Student(51L);
        wilhem.teach(stud1, noOfHrsStud1);
        wilhem.teach(stud2,noOfHrsStud2);
        double expectedHours = noOfHrsStud1 + noOfHrsStud2;
        double actualHours = wilhem.getTimeWorked();
        Assert.assertEquals(expectedHours,actualHours,0);
    }

}