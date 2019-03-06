package io.zipcoder.interfaces;

public class Instructors extends People {

    private Instructors(){
    }

    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
