package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("fadhl", 20, "3th year");
        Student student2 = new Student("hasan", 21, "2nd year");

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade level: " + student1.getGradeLevel());

        System.out.println("Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Grade level: " + student2.getGradeLevel());

    }
}