package domaci.OOP.III;

import java.util.List;

public class Audi extends Automobil {
    public Audi(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    public Audi(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
    }

    public Audi() {
    }

    @Override
    public String toString() {
        return "Audi";
    }
}
