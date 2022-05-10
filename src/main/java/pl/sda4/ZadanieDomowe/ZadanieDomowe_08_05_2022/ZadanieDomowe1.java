package pl.sda4.ZadanieDomowe.ZadanieDomowe_08_05_2022;
import java.util.Scanner;

/*
1. Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
 */
public class ZadanieDomowe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        System.out.print("Dzielniki dla twojej liczby to: ");
        for (int i = 1; i <= liczba; i++) {
            if ((liczba % i) == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
