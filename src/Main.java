import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */
        System.out.println("Wypisujemy wartości obu konstruktorów, pX i pX, pY, pZ");
        Punkt punktA = new Punkt(7);
        punktA.toString();

        Punkt punktB = new Punkt(1, 2, 3);
        punktB.toString();
        System.out.println("");

        System.out.println("Nadpisujemy wartości setterami:");
        punktA.setpX(2);
        punktA.setpY(4);
        punktA.setpZ(6);
        punktA.toString();

        System.out.println("");
        System.out.println("Wartości punktu A:");
        System.out.println("X punktu A: " + punktA.getpX());
        System.out.println("Y punktu A: " + punktA.getpY());
        System.out.println("Z punktu A: " + punktA.getpZ());
        System.out.println("");
        System.out.println("Wartości punktu B:");
        System.out.println("X punktu B: " + punktB.getpX());
        System.out.println("X punktu B: " + punktB.getpY());
        System.out.println("X punktu B: " + punktB.getpZ());
        System.out.println("");
        System.out.println("Suma wartości punktu B:");
        System.out.println(punktB.suma());
        System.out.println("Różnica wartości punktu B:");
        System.out.println(punktB.roznica());
        System.out.println("Różnica A:");
        System.out.println(punktA.roznica(punktB.getpX(), punktB.getpY(), punktB.getpZ()));
        System.out.println("Różnica B:");
        System.out.println(punktB.roznica(punktB.getpX(), punktB.getpY(), punktB.getpZ()));

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

    }
}
