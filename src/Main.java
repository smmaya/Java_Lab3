
public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student stu = new Student("Adam", "Słodowy", 123443, true);
        students[0] = stu;
        stu = new Student("Bartek", "Iksiński", 987304, false);
        students[1] = stu;
        stu = new Student("Daria", "Iglasta", 998701, true);
        students[2] = stu;

        for (Student student : students) {
            student.displayObject();
            System.out.println("");
        }
    }
}
