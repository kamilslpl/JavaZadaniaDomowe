package pl.sda4.ZadanieDomowe.ZadanieDomowe_08_05_2022;
import java.util.Scanner;
/*
2. Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem
        wypisz największą z nich.
        Notatka:
        - wczytujemy liczby do tablicy długości: 5 liczb
 */
public class ZadanieDomowe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];
        System.out.println("Podaj 5 liczb dodatnich");

        for (int i = 0; (i < tablica.length); i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe: ");
            int wpisanaliczba = scanner.nextInt();
            tablica[i] = wpisanaliczba;
            if (tablica[i] < 0) {
                System.out.println("To jest liczba minusowa, podaj dodatnia: ");
                i = i - 1;
            }
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
            }
        }
        System.out.println("Najwieksza liczba w tablicy to: " + szukaneMaksimum);
    }
    }
