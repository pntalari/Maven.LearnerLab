package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class StudentTest {

    @Test
    public void testImplementation() {
        Long expectedId = 50L;
        Student student = new Student(expectedId);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Long expectedId = 50L;
        Student student = new Student(expectedId);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnTest() {
        Long expectedId = 50L;
        Student student = new Student(expectedId);
        double expectedStudyTime = 100;
        double beforeStudyTime = student.getTotalStudyTime();
        student.learn(100.0);
        double actualStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTime,actualStudyTime,0);
    }

    @Test
    public void getTotalStudyTimeTest() {
    }
}