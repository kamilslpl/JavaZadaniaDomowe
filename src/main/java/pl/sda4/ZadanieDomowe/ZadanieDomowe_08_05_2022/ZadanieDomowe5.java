package pl.sda4.ZadanieDomowe.ZadanieDomowe_08_05_2022;
import java.util.Random;
import java.util.Scanner;

/*
5. Pobierz od użytkownika liczbę X, a następnie wylosuj 5 liczb z zakresu 1-49.
Sprawdź czy liczba użytkownika jest w wylosowanych liczbach.
 */
public class ZadanieDomowe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[48];
        int bingoLicznik = 0;
        System.out.println("Podaj liczbe X: ");
        int wpisanaliczba = scanner.nextInt();
        System.out.println("Dziekuje, teraz losuje liczby: ");
        for (int i = 0; (i < tablica.length); i++) {
            int wylosowanaLiczba = new Random().nextInt(48) + 1;
            tablica[i] = wylosowanaLiczba;
            System.out.print(tablica[i] + ", ");
            if (tablica[i] == wpisanaliczba) {
            bingoLicznik++;
            }

        }
        System.out.println();
        if (bingoLicznik ==0){
            System.out.println("Miales pecha, nic nie traflies :(");        }
        else {
            System.out.println("Bingo " + bingoLicznik + " razy. Gratulacje :)");
        }
        }


    }
