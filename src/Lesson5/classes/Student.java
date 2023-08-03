package Lesson5.classes;

import java.util.Arrays;

// extends - расширять
public class Student extends Person {
    private Integer course;
    private Integer group;
    private int[] marks;

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public Integer getCourse() {
        return course;
    }

    public Integer getGroup() {
        return group;
    }

    @Override
    public String toString() {
        // super - обращение к предку
        // this - обращение к себе
        String personString = super.toString();
        return "Student{" +
                "course=" + course +
                ", group=" + group +
                ", marks=" + Arrays.toString(marks) +
                '}' + personString;
    }
}
