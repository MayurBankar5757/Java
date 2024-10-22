package fileIO;

import java.io.Serializable;

public class Student1 extends Person implements Serializable {
    private String PRN;
    private Course course;
    transient private int age;  // transient field, won't be serialized

    public Student1(String name, String PRN, String courseName,int courseId,double fees, int age) {
        super(name);
        this.PRN = PRN;
        this.course = new Course(courseId,courseName,fees);
        this.age = age;
    }

    public String toString() {
        return "Name: " + getName() + ", PRN: " + PRN + ", Age (transient): " + age + ", " + course;
    }
}