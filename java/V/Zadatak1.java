package domaci.java.V;

public class Zadatak1 {

    static boolean proveraJednakostiNizova(int[] niz1, int[] niz2) {
        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] != niz2[i])
                    return false;
            }
            return true;
        }
        return false;
    }

    //Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 5, 5};
        int[] test2 = {1, 2, 2, 3};

        for (int e : test1)
            System.out.print(e + " ");
        System.out.println();
        for (int e : test2)
            System.out.print(e + " ");
        System.out.println();

        //System.out.println(proveraJednakostiNizova(test1, test2));
        boolean provera = proveraJednakostiNizova(test1, test2);
        if (provera)
            System.out.println("Nizovi su jednaki.");
        else
            System.out.println("Nizovi nisu jednaki.");

    }
}
