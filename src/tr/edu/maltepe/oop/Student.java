package tr.edu.maltepe.oop;

public class Student {
    private String name;
    private int age;
    private String gradeLevel;

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
}
