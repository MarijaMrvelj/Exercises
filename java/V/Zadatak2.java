package domaci.java.V;

public class Zadatak2 {

    static void ispis(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static int[] zbirElemenataA(int[] niz1, int[] niz2) {
        int[] noviNiz = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[i] + niz2[i];
        }
        return noviNiz;
    }

    /*static int zbirElemenataA(int[] niz1, int[] niz2) {
        int sum = 0;
        for (int i = 0; i < niz1.length; i++) {
            sum += niz1[i] + niz2[i];
        }
        return sum;
    }*/
    //*

    static int[] zbirElemenataB(int[] niz1, int[] niz2) {
        int duzinaNiza;
        if (niz1.length >= niz2.length) {
            duzinaNiza = niz1.length;
        } else {
            duzinaNiza = niz2.length;
        }
        int[] noviNiz = new int[duzinaNiza];
        for (int i = 0; i < noviNiz.length; i++) {
            int elementNiz1 = 0;
            int elementNiz2 = 0;
            if (i < niz1.length) {
                elementNiz1 = niz1[i];
            }
            if (i < niz2.length) {
                elementNiz2 = niz2[i];
            }
            noviNiz[i] = elementNiz1 + elementNiz2;
        }
        return noviNiz;
    }
    /* ZA ZBIR SVIH ELEMENATA:
    static int zbirElemenataB(int[] niz1, int[] niz2) {
        int sum = 0;
        int duzinaNiza;
        if (niz1.length >= niz2.length) {
            duzinaNiza = niz1.length;
        } else {
            duzinaNiza = niz2.length;
        }
        int[] noviNiz = new int[duzinaNiza];

        for (int i = 0; i < noviNiz.length; i++) {
            int elementNiz1 = 0;
            int elementNiz2 = 0;
            if (i < niz1.length) {
                elementNiz1 = niz1[i];
            }
            if (i < niz2.length) {
                elementNiz2 = niz2[i];
            }
            noviNiz[i] = elementNiz1 + elementNiz2;
        }
        for (int i = 0; i < noviNiz.length; i++) {
            sum += noviNiz[i];
        }
        return sum;
    }*/

    //Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
    //svih elemenata na istoj poziciji.

    //**(Neobavezan deo) Implementirati funkciju da prima nizove razlicitih velicina, tako da
    //sabira sve elemente na istim pozicijama, ukoliko jednom nizu ponestaje elemenata, prepisati
    //preostale elemente iz veceg niza

    public static void main(String[] args) {

        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 5, 6};

        //System.out.println(zbirElemenataA(test1, test2));
        //System.out.println(zbirElemenataB(test1, test3));

        ispis(test1);
        ispis(test2);

        int[] nizA = zbirElemenataA(test1, test2);
        for (int e : nizA) {
            System.out.println("Rezultat = " + e);
        }

        //b
        System.out.println();
        System.out.println("**Dodatak");
        int[] test3 = {1, 2, 3, 4, 5};
        ispis(test1);
        ispis(test3);

        int[] nizB = zbirElemenataB(test1, test3);
        for (int e : nizB) {
            System.out.println("Rezultat = " + e);
        }
    }
}
