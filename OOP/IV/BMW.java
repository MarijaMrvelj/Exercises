package domaci.OOP.IV;

import java.util.List;

public class BMW extends Automobil {

    public BMW(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
        setNaziv("BMW");
    }

    public BMW(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
        setNaziv("BMW");
    }

    public BMW() {
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() > 100;
    }

    @Override
    public double cenaTockova() {
        return 4 * 100;
    }

    @Override
    public void zameniTocak() {
        for (Tocak t : this.getListaTockova()) {
            if (t.getTrajanjeTocka() > 100)
                this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 100));
        }
    }
}
