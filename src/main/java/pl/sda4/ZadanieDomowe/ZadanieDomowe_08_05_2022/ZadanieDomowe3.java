package pl.sda4.ZadanieDomowe.ZadanieDomowe_08_05_2022;
import java.util.Scanner;

/*
3. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb
mniejszych od zera (łącznie 10) i potem wypisz ich sumę.
 */
public class ZadanieDomowe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Podaj 5 liczb dodatnich i 5 liczb ujemnych");
        int sumatablicy = 0;
        int licznikMinusowych = 0;
        int licznikDodatnich = 0;

        for (int i = 0; (i < tablica.length); i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe: ");
            int wpisanaliczba = scanner.nextInt();
            tablica[i] = wpisanaliczba;
            sumatablicy = sumatablicy + tablica[i];
            if (tablica[i] == 0) {
                System.out.println("To jest liczba 0, podaj dodatnia lub ujemna: ");
                i = i - 1;
            }

            if (tablica[i] < 0) {
                    licznikMinusowych++;
                    System.out.println("To jest " + licznikMinusowych + " minusowa liczba. ");
                }
            else {
                licznikDodatnich++;
                System.out.println("To jest " + licznikDodatnich + " dodatnia liczba. ");
            }

            if ((tablica[i] > 0) && (licznikDodatnich > 5)) {

                System.out.println("Masz juz " + (licznikDodatnich-1) + " dodatnich liczb, podaj ujemna: ");
                i = i - 1;
            }
            if ((tablica[i] < 0) && (licznikMinusowych > 5)) {

                System.out.println("Masz juz " + (licznikMinusowych-1) + " minusowych liczb, podaj dodatnia: ");
                i = i - 1;
            }
        }
        System.out.println("Suma liczb w tablicy to: " + sumatablicy);
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
            }
        }
        System.out.println("Najwieksza liczba w tablicy to: " + szukaneMaksimum);
    }
    }
