package Lesson6.lesson.person;

public class Student extends ScienceWorkParticipant {
    private int group;
    private int course;

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
