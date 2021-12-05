import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student studentA = new Student("Adam", "Słodowy", 123443, true);
        students[0] = studentA;
        studentA = new Student("Bartek", "Iksiński", 987304, false);
        students[1] = studentA;
        studentA = new Student("Daria", "Iglasta", 998701, true);
        students[2] = studentA;

        for (Student student : students) {
            student.niceDisplay();
            System.out.println("");
        }
    }
}
