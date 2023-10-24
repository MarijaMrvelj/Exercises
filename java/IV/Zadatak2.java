package domaci.java.IV;

public class Zadatak2 {

    static void trazenjeBroja(int[] niz, int broj) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == broj) {
                System.out.println("Element " + broj + " je pronadjen!");
                break;
            }
            else
                System.out.println("Pogresan element.");
        }
    }

    public static void main(String[] args) {

        //Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
        //niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
        //element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
        //(Cim naidje na taj element, ne treba da ga trazi dalje).

        int[] nizCelihBr = {12, 24, 37, 8, 3, 16};
        System.out.print("Elementi niza: ");
        for (int i = 0; i < nizCelihBr.length; i++) {
            System.out.print(nizCelihBr[i] + " ");
            if (i == nizCelihBr.length - 1) //zelim da poruke stampa u sledecem redu, posle niza
                System.out.println();
        }

        int trazeniBroj = 37;
        trazenjeBroja(nizCelihBr, trazeniBroj);
    }
}
