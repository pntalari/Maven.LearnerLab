package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;

public final class Students extends People<Student> {

    private Students() {
    }

 //   private static class SingletonHelper {
        private static final Students INSTANCE = new Students();
  //  }

    public static Students getInstance() {
        return INSTANCE;
    }

    public ArrayList<Person> getList(){
        return peopleList;
    }

}
