package domaci.OOP.III;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Tocak t1 = new Tocak(75);
        Tocak t2 = new Tocak(25);
        Tocak t3 = new Tocak(105);

        System.out.println(t1);

        Automobil a1 = new Audi(new ArrayList<>(), 2016, 7000);
        Automobil a2 = new BMW(new ArrayList<>(), 2012, 8500);
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

        System.out.println("Najstariji automobil je " + s1.vratiNajstariji());
        System.out.println("Najskuplji automobil je " + s1.vratiNajskuplji());

        System.out.println("Da li je tocak automobila " + a1 + " ostecen? " + a1.vratiOstecene(t2));
        System.out.println("Da li je tocak automobila " + a2 + " ostecen? " + a2.vratiOstecene(t3));

        System.out.println("Cena tockova automobila " + a1 + " = " + a1.cenaTockova());
        System.out.println("Cena tockova automobila " + a2 + " = " + a2.cenaTockova());
        System.out.println("Cena tockova automobila " + a3 + " = " + a3.cenaTockova());

        a1.zameniTocak();
        System.out.println(a1.getListaTockova());
        a2.zameniTocak();
        System.out.println(a2.getListaTockova());
        a3.zameniTocak();
        System.out.println(a3.getListaTockova());

        System.out.println(s1);
    }
}
