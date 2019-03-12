package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON, WILHEM, DOLIO, FROILAN;

    private  Educator instructorEnum;

    public void teach(Learner learner, double numberOfHours) {
        this.instructorEnum = LEON;
        this.instructorEnum = WILHEM;
        this.instructorEnum = DOLIO;
        this.instructorEnum = FROILAN;

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
