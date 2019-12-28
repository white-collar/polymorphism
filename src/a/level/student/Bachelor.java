package a.level.student;

import java.awt.*;

public class Bachelor extends Student implements Person {

    private static double IS_GOOD_THRESHOLD = 8.0;

    private String bachelorCourseWorkName;

    Bachelor() {
    }

    public static void doWrong() {
        System.out.println("Static is bad");
    }

    public Bachelor(Student student, String bachelorCourseWorkName) {
        super(student.getName(), student.getLastName(), student.getAge(), student.getRating());
        this.bachelorCourseWorkName = bachelorCourseWorkName;
    }

    public String getBachelorCourseWorkName() {
        return bachelorCourseWorkName;
    }

    public void setBachelorCourseWorkName(String bachelorCourseWorkName) {
        this.bachelorCourseWorkName = bachelorCourseWorkName;
    }

    @Override
    public boolean isGoodStudent() {
        return getRating() > IS_GOOD_THRESHOLD;
    }
}
