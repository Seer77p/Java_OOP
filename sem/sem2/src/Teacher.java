public class Teacher extends Human implements PlaceOfLivihg{
    @Override
    public void tellInfo() {
        System.out.println("hi! my name is "+ name + " " + lastName + " im  " + age
                + " and im a teacher ");

    }

    public Teacher(String name, String lastName, int age) {
        super(name, lastName, age);
    }
}