package domaci.java.II;

import java.util.Scanner;

public class Zadatak3P {

    public static void main(String[] args) {

        //Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
        //tacka program se zavrsava i vraca prethodno unete tekstove.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tekst sve dok ne unesete tacku (`.`): ");
        String tekst = sc.nextLine();
        String ceoTekst = tekst + " ";

        while (!tekst.equals(".")) {
            tekst = sc.nextLine();
            if (tekst.equals(".")) {
                break;
            }
            ceoTekst += tekst + " ";
        }
        System.out.println("Vas tekst je: " + ceoTekst);
    }
}