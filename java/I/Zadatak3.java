package domaci.java.I;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        //Napisati program gde korisnik unosi dva realna broja, zatim unosi naziv operacije koju zeli
        //da izvrsi nad tim brojevima(sabiranje, oduzimanje, mnozenje, deljenje), zatim istampati
        //rezultat date operacije.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva realna broja: ");
        double prviBroj = sc.nextDouble();
        double drugiBroj = sc.nextDouble();
        sc.nextLine();

        System.out.println("Unesite jednu od ponudjenih operacija (sabiranje, oduzimanje, mnozenje, deljenje): ");
        String operacija = sc.nextLine();

        switch (operacija) {
            case "sabiranje":
                System.out.println("Rezultat je: " + (prviBroj + drugiBroj));
                break;
            case "oduzimanje":
                System.out.println("Rezultat je: " + (prviBroj - drugiBroj));
                break;
            case "mnozenje":
                System.out.println("Rezultat je: " + (prviBroj * drugiBroj));
                break;
            case "deljenje":
                    System.out.println("Rezultat je: " + (prviBroj / drugiBroj));
                    break;
        }
    }
}
