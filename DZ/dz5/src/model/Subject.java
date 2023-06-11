package model;

public enum Subject {
    MATH("Математика"),
    PHYSICS("Физика"),
    CHEMISTRY("Химия"),
    BIOLOGY("Биология");
    private String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
