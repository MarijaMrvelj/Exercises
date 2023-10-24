package domaci.java.I;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
        //Napisati program gde korisnik unosi ceo broj, ukoliko je broj paran, promeniti ga u neparan i
        //istampati, ukoliko je neparan, samo ispisati poruku da je u pitanju neparan broj.

        System.out.print("Unesite ceo broj: ");
        Scanner sc = new Scanner(System.in);
        int broj = sc.nextInt();

        if (broj % 2 == 0) {
            broj += 1;
            System.out.println("Neparan broj: " + broj);
        }
        else
            System.out.println("Broj koji ste uneli je neparan.");
    }
}
