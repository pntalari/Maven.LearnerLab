package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    Person personObj;

    @Test
    public void setIDTest(){
        Long expectedID = 50L;
        Person personObj = new Person(expectedID);
        Long actualId = personObj.getId();

        Assert.assertEquals(expectedID,actualId);
    }

    @Test
    public void setNameTest(){
        Long expectedID = 50L;
        String expectedName = "Nirmala";
        Person personObj = new Person(expectedID);
        personObj.setName(expectedName);
        String actualName = personObj.getName();

        Assert.assertEquals(expectedName,actualName);
    }

}
