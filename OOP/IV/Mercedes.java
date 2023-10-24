package domaci.OOP.IV;

import java.util.List;

public class Mercedes extends Automobil {


    public Mercedes(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
        setNaziv("Mercedes");
    }

    public Mercedes(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
        setNaziv("Mercedes");
    }

    public Mercedes() {
    }

    @Override
    public boolean vratiOstecene(Tocak t) {
        return t.getTrajanjeTocka() > 100;
    }

    @Override
    public double cenaTockova() {
        return 4 * 120;
    }

    @Override
    public void zameniTocak() {
        for (Tocak t : this.getListaTockova()) {
            if (t.getTrajanjeTocka() > 100)
                this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 120));
        }
    }

}
