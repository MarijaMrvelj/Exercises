package domaci.java.II;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        //Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj: ");
        int broj = sc.nextInt();
        int faktorijel = 1;

        for (int i = 1; i <= broj; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja " + broj + " je: " + faktorijel);
    }
}
