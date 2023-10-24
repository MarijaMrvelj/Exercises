package domaci.OOP.III;

import java.util.List;

public class BMW extends Automobil {
    public BMW(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    public BMW(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
    }

    public BMW() {
    }

    @Override
    public String toString() {
        return "BMW";
    }
}
