package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    LEON(1L), WILHEM(2L), NHU(3L), FROILAN(4L);

    private final Instructor instructor;
    private double timeWorked;

    Educator(Long id) {
        instructor = new Instructor(id, this.name());
        Instructors.getInstance().add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
       learner.learn(numberOfHours);
       timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner lern : learners
        ) {
            lern.learn(numberOfHoursPerLearner);
        }
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

}
