package domaci.OOP.IV;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Tocak t1 = new Tocak(55);
        Tocak t2 = new Tocak(45);
        Tocak t3 = new Tocak(105);

        System.out.println(t1);
        Automobil a1 = new Audi(new ArrayList<>(), 2018, 7000);
        Automobil a2 = new BMW(new ArrayList<>(), 2004, 8500);
        Automobil a3 = new Mercedes(new ArrayList<>(), 2010, 8000);

        a1.getListaTockova().add(t1);
        a1.getListaTockova().add(t2);
        a1.getListaTockova().add(t2);
        a1.getListaTockova().add(t1);

        a2.getListaTockova().add(t2);
        a2.getListaTockova().add(t3);
        a2.getListaTockova().add(t1);
        a2.getListaTockova().add(t2);

        a3.getListaTockova().add(t3);
        a3.getListaTockova().add(t1);
        a3.getListaTockova().add(t2);
        a3.getListaTockova().add(t3);

        Salon s1 = new Salon(new ArrayList<>());

        s1.getListaAutomobila().add(a1);
        s1.getListaAutomobila().add(a2);
        s1.getListaAutomobila().add(a3);

        System.out.println("Najstariji automobil je " + s1.vratiNajstariji().getNaziv());
        System.out.println("Najskuplji automobil je " + s1.vratiNajskuplji().getNaziv());

        System.out.println("Da li je tocak automobila " + a1.getNaziv() + " ostecen? " + a1.vratiOstecene(t2));
        System.out.println("Da li je tocak automobila " + a2.getNaziv() + " ostecen? " + a2.vratiOstecene(t3));

        System.out.println("Cena tockova automobila " + a1.getNaziv() + " = " + a1.cenaTockova());
        System.out.println("Cena tockova automobila " + a2.getNaziv() + " = " + a2.cenaTockova());
        System.out.println("Cena tockova automobila " + a3.getNaziv() + " = " + a3.cenaTockova());

        System.out.println();
        a1.zameniTocak();
        System.out.println(a1.getListaTockova());
        a2.zameniTocak();
        System.out.println(a2.getListaTockova());
        a3.zameniTocak();
        System.out.println(a3.getListaTockova());

        System.out.println();
        System.out.println(s1);
    }
}
