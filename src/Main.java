import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilość iteracji: ");
        int i = scanner.nextInt();
        while (i > 0) {
            --i;
            System.out.print("Podaj numer: ");
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(LiczbyEnum.JEDEN);
                case 2 -> System.out.println(LiczbyEnum.DWA);
                case 3 -> System.out.println(LiczbyEnum.TRZY);
                case 4 -> System.out.println(LiczbyEnum.CZTERY);
                case 5 -> System.out.println(LiczbyEnum.PIEC);
                case 6 -> System.out.println(LiczbyEnum.SZESC);
                default -> {
                    System.out.println(StatusEnum.KONIEC);
                    return;
                }
            }
            if (i == 0) {
                System.out.println(StatusEnum.KONIEC + " PROGRAMU");
            } else{
                System.out.println(StatusEnum.KONTYNUUJEMY);
            }
        }

    }
}

