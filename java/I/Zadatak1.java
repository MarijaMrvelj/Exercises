package domaci.java.I;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        //Napisati program gde korisnik unosi svoj broj godina. Ukoliko ima 18 ili vise godina, ispisati
        //poruku da korisnik sme da konzumira alkohol, u suprotnom ispisati neku drugu poruku.

        System.out.print("Unesite broj svojih godina: ");
        Scanner sc = new Scanner(System.in);
        int godine = sc.nextInt();

        if (godine >= 18)
            System.out.println("Dozvoljeno Vam je konzumiranje alkohola.");
        else
            System.out.println("Nije Vam dozvoljeno konzumiranje alkohola!");
    }
}
