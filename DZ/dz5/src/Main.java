import comtroller.Controller;
import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        model.Teacher teacher = new model.Teacher(1, "Иванов");
        List<Student> students = new ArrayList<>();
        students.add(new model.Student(101, "Петров"));
        students.add(new model.Student(102, "Сидоров"));
        students.add(new model.Student(103, "Tomas"));
        model.Subject subject = model.Subject.MATH;


        model.Teacher teacher1 = new Teacher(2, "Nic");
        List<Student> students1 = new ArrayList<>();
        students1.add(new model.Student(105, "Petrov"));
        students1.add(new model.Student(106, "Petr"));
        students1.add(new model.Student(107, "Olga"));
        model.Subject subject1 = model.Subject.PHYSICS;

        Controller controller = new Controller();

        StudyGroup studyGroup = controller.createStudyGroup(teacher, students, subject);
        System.out.println("Учебная группа: " + studyGroup);
        StudyGroup studyGroup1 = controller.createStudyGroup(teacher1, students1, subject1);
        System.out.println("Учебная группа: " + studyGroup1);
    }


}