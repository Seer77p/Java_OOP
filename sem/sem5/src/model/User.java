package model;

public class User {
    private String name;
    private String lastName;
    private long moneyAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public User() {
    }

    public User(String name, String lastName, long moneyAmount) {
        this.name = name;
        this.lastName = lastName;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}