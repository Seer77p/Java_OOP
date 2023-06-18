//Рефакторинг:
// Применили принцип единой ответственности (SRP),
// сделав класс StudentGroup ответственным только за
// хранение списка студентов и преподавателя учебной группы.

// Комментарий:
// После рефакторинга класс StudentGroup придерживается принципов SOLID.
// Он содержит список студентов и преподавателя и реализует интерфейс Iterable<Student>,
// позволяющий выполнять итерацию по студентам в группе.


import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
}
