package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureby() {
        double noOfHrs = 100;
        Long expectedInstId1 = 1L;
        Long expectedInstId2 = 2L;

        Students studSingleton = Students.getInstance();
        ZipCodeWilmington singleton = ZipCodeWilmington.getInstance();

        Student stud1 = new Student(50L);
        Person stud2 = new Student(51L);
        Student stud3 = new Student(52L);
        Student stud4 = new Student(53L);
        studSingleton.add(stud1);
        studSingleton.add(stud2);
        studSingleton.add(stud3);

        Instructor instructor1 = new Instructor(expectedInstId1);
        Instructor instructor2 = new Instructor(expectedInstId2);
        Student[] studArr = new Student[]{new Student(50L), new Student(51L),
                new Student(52L), new Student(53L)};

        singleton.hostLecture(instructor1, noOfHrs);
        singleton.hostLecture(instructor2, noOfHrs);

        double expectedHrs = 100 / studArr.length;
        double actualHrs = studArr[1].getTotalStudyTime();
        Assert.assertEquals(expectedHrs, actualHrs, 0);
        Assert.assertEquals(studArr[2].getTotalStudyTime(), studArr[3].getTotalStudyTime(), 0);
    }

    @Test
    public void hostLecture1() {
    }
}