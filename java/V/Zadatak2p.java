package domaci.java.V;

public class Zadatak2p {

    //Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
    //svih elemenata na istoj poziciji.

    //**(Neobavezan deo) Implementirati funkciju da prima nizove razlicitih velicina, tako da
    //sabira sve elemente na istim pozicijama, ukoliko jednom nizu ponestaje elemenata, prepisati
    //preostale elemente iz veceg niza

    static void ispis(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    static int[] zbirElemenataA(int[] niz1, int[] niz2) {
        int[] noviNiz = new int[niz1.length];
        for (int i = 0; i < noviNiz.length; i++) {
            noviNiz[i] = niz1[i] + niz2[i];
        }
        return noviNiz;
    }
    static int[] kopiranje(int[] niz) {
        int[] noviNiz = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            noviNiz[i] = niz[i];
        }
        return noviNiz;
    }

    static int[] zbirElemenataB(int[] niz1, int[] niz2) {
        int[] noviNiz;
        if (niz1.length > niz2.length) {
            noviNiz = kopiranje(niz1);
            for (int i = 0; i < niz2.length; i++) {
                noviNiz[i] += niz2[i];
            }
        } else {
            noviNiz = kopiranje(niz2);
            for (int i = 0; i < niz1.length; i++) {
                noviNiz[i] += niz1[i];
            }
        }
        return noviNiz;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 5, 6};

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
