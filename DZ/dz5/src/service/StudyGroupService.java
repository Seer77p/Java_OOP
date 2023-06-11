package service;

import model.StudyGroup;
import model.Subject;
import model.Student;
import model.Teacher;
import java.util.List;

// Класс УчебнаяГруппаСервис
public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students, Subject subject) {
        return new StudyGroup(teacher, students, subject);
    }

}
