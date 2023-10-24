package domaci.OOP.II;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Predmet p1 = new Predmet(5, "Engleski");
        Predmet p2 = new Predmet(4, "Biologija");
        Predmet p3 = new Predmet(3, "Srpski");

        Ucenik u1 = new Ucenik("Ana Markovic", new ArrayList<>(), 7);
        Ucenik u2 = new Ucenik("Milos Nikolic", new ArrayList<>(), 7);
        Ucenik u3 = new Ucenik("Sanja Peric", new ArrayList<>(), 7);
        Ucenik u4 = new Ucenik("Nikola Ilic", new ArrayList<>(), 6);
        Ucenik u5 = new Ucenik("Uros Pesic", new ArrayList<>(), 6);

        Skola s1 = new Skola(new ArrayList<>());

        u1.getListaPredmeta().add(p1);
        u1.getListaPredmeta().add(p2);
        u1.getListaPredmeta().add(p3);

        u2.getListaPredmeta().add(p1);
        u2.getListaPredmeta().add(p2);
        u2.getListaPredmeta().add(p3);

        u3.getListaPredmeta().add(p1);
        u3.getListaPredmeta().add(p2);
        u3.getListaPredmeta().add(p3);

        u4.getListaPredmeta().add(p1);
        u4.getListaPredmeta().add(p2);
        u4.getListaPredmeta().add(p3);

        u5.getListaPredmeta().add(p1);
        u5.getListaPredmeta().add(p2);
        u5.getListaPredmeta().add(p3);

        s1.getUcenici().add(u1);
        s1.getUcenici().add(u2);
        s1.getUcenici().add(u3);
        s1.getUcenici().add(u4);
        s1.getUcenici().add(u5);

        System.out.println(u1);
        System.out.println("Prosek ucenika/ce " + u1.getImePrezime() + " = " + u1.izracunajProsekSvihPredmeta());
        System.out.println("Prosek svih ucenika iz predmeta Biologija: " + s1.prosekSvihUcenikaIzPredmeta("Biologija"));
        System.out.println();
        System.out.println("Prosek svih ucenika 7. razreda: " + s1.prosekSvihUcenikaJedneGodine(7));
        System.out.println();
        System.out.println("Ucenik/ca sa najmanjim prosekom: " + s1.ucenikSaNajmanjimProsekom());
        System.out.println();
        System.out.println(s1);


    }
}
