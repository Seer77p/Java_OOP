//Рефакторинг:
//Применили принцип единой ответственности (SRP),
//сделав класс TeacherGroup ответственным только за хранение списка учителей.

//Комментарий:
//После рефакторинга класс TeacherGroup соответствует принципам SOLID.
// Он содержит список учителей и реализует интерфейс Iterable<Teacher>,
// что позволяет выполнять итерации по учителям в группе.

import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                '}';
    }

    @Override
    public Iterator<Teacher> iterator() {
        return teachers.iterator();
    }
}
