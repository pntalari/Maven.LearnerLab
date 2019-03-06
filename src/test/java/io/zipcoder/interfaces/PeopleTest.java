package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {

    ArrayList<Person> list = new ArrayList<Person>();

    @Test
    public void add() {
        Instructor instruct = new Instructor(1L);
        Student stud = new Student(2L);
        Integer beforeListSize = list.size();
        People list = new People();
        list.add(stud);
        list.add(instruct);
        Integer afterListSize = list.getCount();
        Assert.assertNotEquals(beforeListSize, afterListSize);
        Assert.assertNotNull(list.findById(1L));
        Assert.assertNotNull(list.findById(2L));
    }

    @Test
    public void findById() {
        Long expectedId = 1L;
        String expectedName = "Nirmala";
        Person person = new Person(expectedId);
        person.setName(expectedName);
        People list = new People();
        list.add(person);
        Person actualPerson = list.findById(expectedId);
        String actualName = actualPerson.getName();
        Assert.assertEquals(expectedName,actualName);

    }

    @Test
    public void remove() {
        Instructor instruct = new Instructor(1L);
        Student stud = new Student(2L);
        Integer beforeListSize = list.size();
        People list = new People();
        list.add(instruct);
        list.add(stud);
        Integer afterListSize = list.getCount();
        list.remove(1L);
        Assert.assertNotEquals(beforeListSize, afterListSize);
        Assert.assertNull(list.findById(1L));
        Assert.assertNotNull(list.findById(2L));
    }
}