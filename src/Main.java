import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pojazd pojazdA = new Pojazd("SUV", "Audi", "A8", 4, false);
        Pojazd pojazdB = new Pojazd("Coupe", "BMW", "320TD", 4, false);
        Pojazd pojazdC = new Pojazd("4x4", "Mercedes", "D200", 4, false);
        System.out.println(pojazdA);

        Rower rower = new Rower("Terenowy", "BMX", "CX5", 2, false, 1);
        System.out.println(rower);

        Motocykl motor = new Motocykl("Sport", "Kawasaki", "ZXR 750", 2, false, "Tor wyścigowy");
        System.out.println(motor);

        Autko samochod = new Autko("Kombi", "Mazda", "CX", 4,false, "Czarny", 2000);
        System.out.println(samochod);

        List<Pojazd> listaPojazdow = new ArrayList<Pojazd>();
        listaPojazdow.add(pojazdC);
        listaPojazdow.add(rower);
        listaPojazdow.add(motor);
        listaPojazdow.add(samochod);
        System.out.println(listaPojazdow);

    }
}
