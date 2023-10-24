package domaci.OOP.III;

import java.util.List;

public class Mercedes extends Automobil {
    public Mercedes(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }
    public Mercedes(int godisteAutomobila, double cena) {
        super(godisteAutomobila, cena);
    }
    public Mercedes() {
    }

    @Override
    public String toString() {
        return "Mercedes";
    }
}
