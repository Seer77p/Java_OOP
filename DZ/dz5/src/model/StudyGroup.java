package model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    private Subject subject;


      public StudyGroup(Teacher teacher, List<Student> students, Subject subject) {
        this.teacher = teacher;
        this.students = students;
        this.subject = subject;

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "\n"+"Преподаватель: " + teacher +
                "Студенты: " + students +
                "\nДисциплина: " + getSubject().getName() +"\n";
    }
}
