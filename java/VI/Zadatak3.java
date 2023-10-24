package domaci.java.VI;

//Napraviti funkciju koja prima listu Stringova, neki String i proverava da li se taj String nalazi u listi.

import java.util.ArrayList;

public class Zadatak3 {

    static boolean pronadjiString(ArrayList<String> lista, String s) {

        return lista.contains(s.toLowerCase());
    }


    public static void main(String[] args) {

        ArrayList<String> listaBoja = new ArrayList<>();
        listaBoja.add("crvena");
        listaBoja.add("plava");
        listaBoja.add("zelena");
        listaBoja.add("zuta");
        String boja = "ljubicasta";
        listaBoja.add(boja);

        System.out.println(listaBoja);

        System.out.println(pronadjiString(listaBoja, "Plava"));
        System.out.println("Da li se u listi nalazi " + boja + " boja? " + pronadjiString(listaBoja, boja));
    }
}