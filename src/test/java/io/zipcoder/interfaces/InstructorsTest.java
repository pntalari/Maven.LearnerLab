package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Instructors instructors1 = Instructors.getInstance();
        Instructors instructors2 = Instructors.getInstance();
        Assert.assertSame(instructors1,instructors2);
    }

    @Test
    public void getInstanceInstructorsTest(){
        Instructors InstructorSingleton = Instructors.getInstance();
        Long expectedId1 = 4L;
        Long expectedId2 = 5L;
        Long expectedId3 = 6L;
        Instructor inst1 = new Instructor(expectedId1);
        Person inst2 = new Instructor(expectedId2);
        Instructor inst3 = new Instructor(expectedId3);
        InstructorSingleton.add(inst1);
        InstructorSingleton.add(inst2);
        InstructorSingleton.add(inst3);
        Assert.assertNotNull(InstructorSingleton.findById(expectedId1));
        Assert.assertNotNull(InstructorSingleton.findById(expectedId2));
        Assert.assertNotNull(InstructorSingleton.findById(expectedId3));
    }

}