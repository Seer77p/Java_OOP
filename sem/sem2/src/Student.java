public class Student extends Human implements AdditionalWork, PlaceOfLiving{
    private boolean job;
    private String city;
    public Student(String name, String lastName, int age, boolean job, String city) {
        super(name, lastName, age);
        this.job = job;
        this.city = city;
    }


    public void tellInfo() {
        System.out.println("Privet! my name "+ name + " " + lastName + " im " + age
                + " and im student ");


    }

    @Override
    public boolean isWorking() {
        return job;
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }
}
