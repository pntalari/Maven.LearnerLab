package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public final class Students extends People {

    private Students() {
    }

 //   private static class SingletonHelper {
        private static final Students INSTANCE = new Students();
  //  }

    public static Students getInstance() {
        return INSTANCE;
    }

}
