package domaci.java.VI;

import java.util.ArrayList;

//Napraviti funkciju koja prima listu celih brojeva i izbacuje iz nje sve elemente koji su deljivi sa 4.

public class Zadatak2 {

    static void izbaciElementDeljivSa4(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 4 == 0) {
                lista.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();
        test.add(4); test.add(13); test.add(16);
        test.add(20); test.add(7); test.add(27);
        test.add(12); test.add(32); test.add(24);

        System.out.println(test);
        izbaciElementDeljivSa4(test);
        System.out.println(test);
    }
}