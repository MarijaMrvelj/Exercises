package domaci.java.II;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        //Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj ponavljanja teksta: ");
        int brojPonavljanja = sc.nextInt();
        sc.nextLine();
        System.out.print("Unesite tekst koji zelite: ");
        String tekst = sc.nextLine();

        for (int i = 0; i < brojPonavljanja; i++) {
            System.out.println(tekst);
        }
    }
}
