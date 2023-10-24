package domaci.java.VI;

import java.util.ArrayList;

//Napraviti funkciju koja izbacuje svako pojavljivanje elementa n u listi

public class Zadatak4 {

    static void izbaciUljeza(ArrayList<Integer> lista, int n) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == n) {
                lista.remove(i);
                i--;
            }
        }
    }
    //SA SLACKA
    /*static void izbaciUljeza2(ArrayList<Integer> lista, int n) {
        for (int i = lista.size() - 1; i >= 0; i++) {
            lista.remove(Integer.valueOf(n));
        }
    }*/


    static ArrayList<Integer> kreiranjeListe(){

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            lista.add(i);
        }
        return lista;
    }
    public static void main(String[] args) {

        ArrayList<Integer> test = kreiranjeListe();
        test.add(2);
        test.add(2);
        test.add(2);
        test.add(3);
        System.out.println(test);

        izbaciUljeza(test, 2);
        System.out.println(test);

    }
}
