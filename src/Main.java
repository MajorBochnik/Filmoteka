import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Napiš počet filmů.");
        int pocetFilm = sc.nextInt();
        sc.nextLine();

        Film [] filmy = new Film[pocetFilm];

        for (int i = 0; i < pocetFilm; i++) {
            System.out.println("Zadej název filmu:");
            String nazev = sc.nextLine();

            System.out.println("Rok vydání:");
            int rok = sc.nextInt();
            sc.nextLine();

            System.out.println("Napiš hodnocení:");
            int hodnoceni = sc.nextInt();
            sc.nextLine();

            System.out.println("Kolik je herců:");
            int pocetH = sc.nextInt();
            sc.nextLine();

            Herec[] herci = new Herec[pocetH];


            for (int j = 0; j < pocetFilm; j++) {
                System.out.println("Jméno herce:");
                String jmenoHerce = sc.nextLine();

                System.out.println("Rok narozeni:");
                int rokNarozeni = sc.nextInt();
                sc.nextLine();

                herci[j] = new Herec(jmenoHerce, rokNarozeni);


            }

        }

    }
}