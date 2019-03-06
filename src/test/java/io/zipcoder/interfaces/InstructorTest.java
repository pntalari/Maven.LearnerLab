package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void implementationTest(){
        Long id = 50L;
        Instructor instruct = new Instructor(id);
        Assert.assertTrue(instruct instanceof Person);
    }

    @Test
    public void inheritanceTest(){
        Long id = 50L;
        Instructor instruct = new Instructor(id);
        Assert.assertTrue(instruct instanceof Teacher);
    }

    @Test
    public void teachTest() {
        Long id = 50L;
        double noOfHrs = 100;
        Instructor instruct = new Instructor(id);
        Student stud = new Student(id);
        double beforeHours = stud.getTotalStudyTime();
        double expectedHours = beforeHours + noOfHrs;
        instruct.teach(stud, noOfHrs);
        double actualHours = stud.getTotalStudyTime();
        Assert.assertEquals(expectedHours,actualHours,0);
    }

    @Test
    public void lectureTest() {
        double noOfHrs = 100;
        Instructor instructor = new Instructor(1L);
        Student[] studArr = new Student[]{new Student(50L),new Student(51L),
                new Student(52L),new Student(53L)};
        instructor.lecture(studArr,noOfHrs);
        double expectedHrs = 100/studArr.length;
        double actualHrs = studArr[1].getTotalStudyTime();
        Assert.assertEquals(expectedHrs,actualHrs,0);
        Assert.assertEquals(studArr[2].getTotalStudyTime(),studArr[3].getTotalStudyTime(),0);
    }
}