package domaci.OOP.II;

import java.util.ArrayList;

public class Skola {
    private ArrayList<Ucenik> ucenici;

    public Skola(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }
    public Skola() {}

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }
    public double prosekSvihUcenikaJedneGodine(int godina) {
        double zbir = 0;
        int brojUcenika = 0;
        for (Ucenik u : ucenici) {
            if (u.getGodinaSkolovanja() == godina) {
                zbir += u.izracunajProsekSvihPredmeta();
                brojUcenika++;
            }
        }
        return zbir / brojUcenika;
    }

    public double prosekSvihUcenikaIzPredmeta(String nazivPredmeta) {
        double zbir = 0;
        int brojUcenika = 0;
        for (Ucenik u : ucenici) {
            for (Predmet p : u.getListaPredmeta()) {
                if (p.getNazivPredmeta().equalsIgnoreCase(nazivPredmeta)) {
                    zbir += p.getOcena();
                    brojUcenika++;
                }
            }
        }
        return zbir / brojUcenika;
    }
    public Ucenik ucenikSaNajmanjimProsekom() {
        Ucenik u = null;
        double minProsek = Double.MAX_VALUE;
        for (Ucenik ucenik : ucenici) {
            double prosek = ucenik.izracunajProsekSvihPredmeta();
            if (prosek < minProsek) {
                minProsek = prosek;
                u = ucenik;
            }
        }
        return u;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ucenici skole: \n");
        for (int i = 0; i < ucenici.size() - 1; i++) {
            sb.append(ucenici.get(i).getImePrezime()).append("\n");
        }
        sb.append(ucenici.get(ucenici.size() - 1).getImePrezime());
        return sb.toString();
    }
}
