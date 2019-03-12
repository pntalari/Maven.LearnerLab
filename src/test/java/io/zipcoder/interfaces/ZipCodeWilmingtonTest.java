package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureByTeacherTest() {
        double noOfHrs = 100;

        Students studSingleton = Students.getInstance();
        ZipCodeWilmington singleton = ZipCodeWilmington.getInstance();

        Student stud1 = new Student(50L);
        Student stud2 = new Student(51L);
        Student stud3 = new Student(52L);
        Student stud4 = new Student(53L);
        studSingleton.add(stud1);
        studSingleton.add(stud2);
        studSingleton.add(stud3);
        studSingleton.add(stud4);

        Instructor instructor1 = new Instructor(1L);
        //  Instructor instructor2 = new Instructor(2L);
        Student[] studArr = new Student[]{new Student(50L), new Student(51L),
                new Student(52L), new Student(53L)};

        singleton.hostLecture(instructor1, noOfHrs);
//        singleton.hostLecture(instructor2, noOfHrs);

        double expectedHrs = 100 / studArr.length;
        double actualHrs = stud1.getTotalStudyTime();
        Assert.assertEquals(expectedHrs, actualHrs, 0);
        Assert.assertEquals(stud1.getTotalStudyTime(), stud4.getTotalStudyTime(), 0);
    }

    @Test
    public void hostLectureByTeacherIdTest() {
        //Given
        double noOfHrs = 100;
        Student stud1 = new Student(50L);
        Student stud2 = new Student(51L);
        Student stud3 = new Student(52L);
        Student stud4 = new Student(53L);
        Instructor instructor1 = new Instructor(1L);
        Instructor instructor2 = new Instructor(2L);
        Students studSingleton = Students.getInstance();
        Instructors instructorSingleton = Instructors.getInstance();
        ZipCodeWilmington singleton = ZipCodeWilmington.getInstance();

        studSingleton.add(stud1);
        studSingleton.add(stud2);
        studSingleton.add(stud3);
        studSingleton.add(stud4);

        instructorSingleton.add(instructor1);
        instructorSingleton.add(instructor2);

        //When
        singleton.hostLecture(1L, noOfHrs);
        singleton.hostLecture(2L, noOfHrs);

        double expectedHrs = (100 / studSingleton.peopleList.size())*instructorSingleton.getCount();
        double actualHrs = stud1.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedHrs, actualHrs, 0);
        Assert.assertEquals(stud1.getTotalStudyTime(), stud4.getTotalStudyTime(), 0);

    }

}