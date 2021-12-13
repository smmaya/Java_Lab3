
public class Student {
    public String firstName;
    public String lastName;
    public int numerKatalogu;
    public boolean status;

    public Student(String firstName, String lastName, int numerKatalogu, boolean status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numerKatalogu = numerKatalogu;
        this.status = status;
    }
    public void displayObject(){
        System.out.println("Imię: " + this.firstName);
        System.out.println("Nazwisko: " + this.lastName);
        System.out.println("Numer: " + this.numerKatalogu);
        if(!status){
            System.out.println("Status: Nieaktywny");
        } else {
            System.out.println("Status: Aktywny");
        }
    }
}
