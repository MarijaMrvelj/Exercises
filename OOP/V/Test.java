package domaci.OOP.V;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Planina p1 = new Planina("Stara planina", 2376);
        Planina p2 = new Planina("Kopaonik", 2017);
        Planina p3 = new Planina("Ozren", 1693);
        Planina p4 = new Planina("Tara", 1544);
        Planina p5 = new Planina("Avala", 511);

        ArrayList<Planina> planine = new ArrayList<>();
        planine.add(p1);
        planine.add(p2);
        planine.add(p3);
        planine.add(p4);
        planine.add(p5);

        Amater a = new Amater("Ana Petrovic", planine);

        Rekreativac r = new Rekreativac("Milos Markovic", planine);

        Pro p = new Pro("Petar Ilic", new ArrayList<>());

        p.getListaPlanina().add(p1);
        p.getListaPlanina().add(p2);
        p.getListaPlanina().add(p3);

        System.out.println(a);
        System.out.println(r);
        System.out.println(p);

        a.popniSe(p5);
        a.popniSe(p1);
        System.out.println(a);

        p.popniSe(p4);
        p.popniSe(p5);
        p.popniSe(p2);
        System.out.println(p);
    }
}
