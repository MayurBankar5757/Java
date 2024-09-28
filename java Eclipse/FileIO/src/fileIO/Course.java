package fileIO;

import java.io.Serializable;

class Course implements Serializable {
    private int courseId;
    private String courseName;
    private double fees;

    public Course(int courseId, String courseName, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
    }

    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Fees: " + fees;
    }
}