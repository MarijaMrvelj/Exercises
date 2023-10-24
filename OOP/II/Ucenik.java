package domaci.OOP.II;

import java.util.ArrayList;

public class Ucenik {
    private String imePrezime;
    private ArrayList<Predmet> listaPredmeta;
    private int godinaSkolovanja;

    public Ucenik(String imePrezime, ArrayList<Predmet> listaPredmeta, int godinaSkolovanja) {
        this.imePrezime = imePrezime;
        this.listaPredmeta = listaPredmeta;
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public Ucenik(ArrayList<Predmet> listaPredmeta, int godinaSkolovanja) {
        this.listaPredmeta = listaPredmeta;
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public Ucenik() {}

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

    public void setListaPredmeta(ArrayList<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public void setGodinaSkolovanja(int godinaSkolovanja) {
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public double izracunajProsekSvihPredmeta () {
        int zbir = 0;
         for (Predmet p : listaPredmeta) {
            zbir +=  p.getOcena();
         }
        return (double) zbir / listaPredmeta.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ucenik/ca ").append(imePrezime).append(" pohadja ").append(godinaSkolovanja).append(" razred\n");
        sb.append("Spisak predmeta:\n").append(listaPredmeta);
    return sb.toString();
    }

}
