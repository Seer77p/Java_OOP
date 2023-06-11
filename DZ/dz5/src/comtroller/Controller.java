package comtroller;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Subject;
import service.StudyGroupService;
import java.util.ArrayList;
import java.util.List;

// Класс Контроллер
public class Controller {
    private StudyGroupService studyGroupService;

    public Controller() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students, Subject subject) {
        return studyGroupService.createStudyGroup(teacher, students, subject);
    }

    public List<Integer> getStudentIds(List<Student> students) {
        List<Integer> studentIds = new ArrayList<>();
        for (Student student : students) {
            studentIds.add(student.getId());
        }
        return studentIds;
    }

    public int getTeacherId(Teacher teacher) {
        return teacher.getId();
    }

    public StudyGroupService getStudyGroupService() {
        return studyGroupService;
    }
}
