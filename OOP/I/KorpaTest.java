package domaci.OOP.I;

import java.util.ArrayList;

public class KorpaTest {

    public static void main(String[] args) {

        Korpa lista1 = new Korpa(new ArrayList<>());
        lista1.dodajNamirnicu("mleko");
        lista1.dodajNamirnicu("jaja");
        lista1.dodajNamirnicu("sir");
        lista1.dodajNamirnicu("meso");

        lista1.izlistaj();

        String namirnica = "hleb";
        System.out.print("Da li je " + namirnica + " u listi namirnica? ");
        System.out.println(lista1.daLiJeNamirnicaUListi("hleb"));

        System.out.print("Ukupna cena svih namirnica = ");
        System.out.println(lista1.cenaKorpe());

        Korpa lista2 = new Korpa(new ArrayList<>());
        lista2.dodajNamirnicu("kupus");
        lista2.dodajNamirnicu("krompir");
        lista2.dodajNamirnicu("crni luk");
        System.out.println("Lista namirnica: " + lista2.getListaNamirnica());
        System.out.println("Da li je kupus u listi namirnica? " + lista2.daLiJeNamirnicaUListi("kupus"));

        System.out.println(lista2);
    }
}
