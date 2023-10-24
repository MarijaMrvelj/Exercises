package domaci.java.VI;

import java.util.ArrayList;

//Napraviti funkciju koja kreira i vraca listu od 30 parnih brojeva.

public class Zadatak1 {

    static ArrayList<Integer> kreiranjeListe(){

        ArrayList<Integer> lista = new ArrayList<>(30);

        for (int i = 0; i < 60; i++) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    public static void main(String[] args) {
        System.out.println("Lista 30 parnih brojeva: ");

        ArrayList<Integer> al = kreiranjeListe();
        System.out.println(al);

        System.out.println(al.size());
    }
}

