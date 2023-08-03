package Lesson6.lesson.person;

public abstract class ScienceWorkParticipant extends Person {
    private String workName;
    private String mark;

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkName() {
        return workName;
    }
}
