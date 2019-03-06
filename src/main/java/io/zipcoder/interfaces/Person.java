package io.zipcoder.interfaces;

public class Person {

    private final long id;
    private String name;

    public Person(Long Pid) {
        this.id = Pid ;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
