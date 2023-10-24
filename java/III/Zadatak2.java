package domaci.java.III;

public class Zadatak2 {
    public static void main(String[] args) {

        //Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.

        int[] niz = {3, 12, 24, 8, 7, 1};
        int sum = 0;
        System.out.println("Elementi niza: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                sum += niz[i];
            }
            System.out.print(niz[i] + " ");
        }
        System.out.println();
        System.out.println("Suma svih parnih brojeva niza je: " + sum);
    }
}
