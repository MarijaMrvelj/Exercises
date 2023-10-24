package domaci.OOP.IV;

import java.util.List;

public abstract class Automobil {

    private String naziv;
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

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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

    public abstract boolean vratiOstecene(Tocak t);
    public abstract double cenaTockova();
    public abstract void zameniTocak();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Model automobila: ").append(naziv).append("\n");
        sb.append("Godina proizvodnje automobila: ").append(godisteAutomobila).append(" | cena: ").append(cena).append("\n");
        for (Tocak t: listaTockova) {
            sb.append("Trajanje tocka: ").append(t.getTrajanjeTocka()).append("\n");
            sb.append("Cena: ").append(t.getCenaTocka()).append("\n");
        }
        return sb.toString();
    }
}
