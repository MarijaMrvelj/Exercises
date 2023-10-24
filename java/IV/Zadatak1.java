package domaci.java.IV;

import java.util.Scanner;

public class Zadatak1 {
    static int brojanjeSamoglasnika(String s) {
        s = s.toLowerCase();
        int broj = 0;
        for (int i = 0; i < s.length(); i++) {
            char karakter = s.charAt(i);
            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u')
                broj++;
        }
        return broj;
    }

    public static void main(String[] args) {

        //Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
        //(Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite neki String: ");
        String nekiString = sc.nextLine();

        int brojSamoglasnika = brojanjeSamoglasnika(nekiString);
        System.out.println("Broj samoglasnika u tom Stringu je: " + brojSamoglasnika);
    }
}
