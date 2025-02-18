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


            for (int j = 0; j < pocetH; j++) {
                System.out.println("Jméno herce:");
                String jmenoHerce = sc.nextLine();

                System.out.println("Rok narozeni:");
                int rokNarozeni = sc.nextInt();
                sc.nextLine();

                herci[j] = new Herec(jmenoHerce, rokNarozeni);

            }

            filmy[i] = new Film(nazev, rok, hodnoceni, herci);

        }

        for (int i = 0; i < pocetFilm; i++) {
            if(filmy[i].getHodnoceni() > 80){
                System.out.println(filmy[i].getNazev());
            }
        }
        int nejlepsi = Integer.MIN_VALUE;
        int IdFilmu = Integer.MIN_VALUE;
        for (int i = 0; i < pocetFilm; i++) {
            if(filmy[i].getHodnoceni() > nejlepsi){
                nejlepsi = filmy[i].getHodnoceni();
                IdFilmu = i;
            }
        }
        System.out.println("Nejlépe hodnocený film je: "+filmy[IdFilmu].getNazev()+" s hodnocením: "+nejlepsi);
        System.out.println("Hráli v něm herci: ");
        filmy[IdFilmu].vypisHerce();

    }
}