package domaci.OOP.III;

import java.util.List;

public class Automobil {
    //Kreirati klasu Automobil koja od atributa ima listu tockova, godiste automobila i cenu.

    private List<Tocak> listaTockova;
    private int godisteAutomobila;
    private double cena;

    public Automobil(List<Tocak> listaTockova, int godisteAutomobila, double cena) {
        this.listaTockova = listaTockova;
        this.godisteAutomobila = godisteAutomobila;
        this.cena = cena;
    }

    public Automobil(int godisteAutomobila, double cena) {
        this.godisteAutomobila = godisteAutomobila;
        this.cena = cena;
    }

    public Automobil() {
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodisteAutomobila() {
        return godisteAutomobila;
    }

    public void setGodisteAutomobila(int godisteAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    //-vratiOstecene(Tocak t) - Proverava da li je dati tocak ostecen, vraca true ako jeste.
    //Tocak od Audi-a je ostecen ukoliko je stariji od 60 dana, dok za BMW i Mercedes za stariji od 100 dana.

    public boolean vratiOstecene(Tocak t) {
        if (this instanceof Audi && t.getTrajanjeTocka() > 60) {
            return true;
        } else return (this instanceof BMW || this instanceof Mercedes) && t.getTrajanjeTocka() > 100;
    }

    //-cenaTockova() - Vrati cenu svih tockova ako znamo da je cena po tocku za BMW 100, Mercedes 120 i Audi 110.
    public int cenaTockova() {
        int cena = 0;
        if (this instanceof Audi)
            cena = 110;
        else if (this instanceof Mercedes)
            cena = 120;
        else if (this instanceof BMW)
            cena = 100;

        return cena * 4;
    }

    //-zameniTocak() - Tocak koji je stariji od granice zameniti novim tockom.
    public void zameniTocak() {
        int granicaAudi = 60;
        int granicaMercedesIBMW = 100;
        if (this instanceof Audi) {
            for (Tocak t : this.getListaTockova()) {
                if (t.getTrajanjeTocka() > granicaAudi)
                    this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 110)); // Zamena starog točka novim
            }
        }
        else if (this instanceof Mercedes || this instanceof BMW){
            for (Tocak t : this.getListaTockova()) {
                if (t.getTrajanjeTocka() > granicaMercedesIBMW) {
                    if (this instanceof Mercedes)
                        this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 120));
                    else
                        this.getListaTockova().set(getListaTockova().indexOf(t), new Tocak(0, 100));
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Godina proizvodnje automobila: ").append(godisteAutomobila).append(" | cena: ").append(cena).append("\n");
        for (Tocak t: listaTockova) {
            sb.append("Trajanje tocka: ").append(t.getTrajanjeTocka()).append("\n");
            sb.append("Cena: ").append(t.getCenaTocka()).append("\n");
        }
        return sb.toString();
    }

}
