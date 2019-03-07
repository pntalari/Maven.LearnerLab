package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final Students studentsInstance = Students.getInstance();
    private static final Instructors instructorsInstance = Instructors.getInstance();
    private static ZipCodeWilmington zcwInstance;

    Learner[] persons = new Learner[studentsInstance.getList().size()];

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(studentsInstance.getList().toArray(persons), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructorsInstance.findById(id);
        teacher.lecture(studentsInstance.getList().toArray(persons), numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return zcwInstance = new ZipCodeWilmington();

    }


}
