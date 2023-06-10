import java.time.LocalDate;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\''+
                ", first Name='"+super.getFirstName()+
                ", second Name='"+super.getSecondName()+
                ", patronymic='"+super.getPatronymic()+
                ", date of birth="+super.getDateOfBirth()+
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
    //    public static class TeacherComparator implements Comparator {
//        @Override
//        public int compare(Object o1, Object o2) {
//            return 0;
//        }
    }
