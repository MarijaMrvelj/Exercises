package domaci.java.III;

public class Zadatak1 {

    public static void main(String[] args) {

        //Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.

        int[] niz = {2, 11, 6, 13, 7, 1};
        System.out.println("Neparni elementi niza: ");
        for (int i = 0; i < niz.length; i++)
            if (niz[i] % 2 != 0) {
                System.out.print(niz[i] + " ");
            }
    }
}
