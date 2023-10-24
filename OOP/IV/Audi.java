package domaci.OOP.IV;

import java.util.List;

public class Audi extends Automobil {


    public Audi(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
        setNaziv("Audi");
    }

    public Audi(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
        setNaziv("Audi");
    }

    public Audi() {

    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() > 60;
    }

    @Override
    public double cenaTockova() {
        return 4 * 110;
    }

    @Override
    public void zameniTocak() {
        for (Tocak t : this.getListaTockova()) {
            if (t.getTrajanjeTocka() > 60)
                this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 110));
        }
    }
}
