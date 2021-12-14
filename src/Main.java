public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        // tu klasycznie
        Osoba os1 = new Osoba("Sławek", "Pierwszy", 123);
        Osoba os2 = new Osoba("Darek", "Drugi", 234);
        Osoba os3 = new Osoba("Marek", "Trzeci", 345);
        Osoba os4 = new Osoba("Magda", "Czwarta", 456);
        Osoba os5 = new Osoba("Kasia", "Piąta", 567);
        // a tu trochę wydajniej dla garbage collectora
        Student[] students = new Student[5];
        Student stu = new Student(os1, WydzialEnum.FD);
        students[0] = stu;
        stu = new Student(os2, WydzialEnum.IS);
        students[1] = stu;
        stu = new Student(os3, WydzialEnum.PR);
        students[2] = stu;
        stu = new Student(os4, WydzialEnum.PR);
        students[3] = stu;
        stu = new Student(os5, WydzialEnum.IS);
        students[4] = stu;

        for (Student student : students) {
            System.out.println(student);
        }
    }
}