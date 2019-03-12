package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void singletonTest() {
        Students studSingleton = Students.getInstance();
        Students secondStudents = Students.getInstance();
        Assert.assertSame(studSingleton, secondStudents);
    }

    @Test
    public void getInstanceStudentsTest(){
        Students studSingleton = Students.getInstance();
        Long expectedId1 = 1L;
        Long expectedId2 = 2L;
        Long expectedId3 = 3L;
        Student stud1 = new Student(expectedId1);
        Student stud2 = new Student(expectedId2);
        Student stud3 = new Student(expectedId3);
        studSingleton.add(stud1);
        studSingleton.add(stud2);
        studSingleton.add(stud3);
        Assert.assertNotNull(studSingleton.findById(expectedId1));
        Assert.assertNotNull(studSingleton.findById(expectedId2));
        Assert.assertNotNull(studSingleton.findById(expectedId3));
    }

}