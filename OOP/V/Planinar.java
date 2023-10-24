package domaci.OOP.V;

import java.util.ArrayList;

public abstract class Planinar {

    //Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara, listu planina i maksimalnu visinu na
    //koju planinar moze da se popne.

    private String imePrezime;
    private ArrayList<Planina> listaPlanina;
    private double maxVisina;

    public Planinar(String imePrezime, ArrayList<Planina> listaPlanina, double maxVisina) {
        this.imePrezime = imePrezime;
        this.listaPlanina = listaPlanina;
        this.maxVisina = maxVisina;
    }

    public Planinar(String imePrezime, double maxVisina) {
        this.imePrezime = imePrezime;
        this.maxVisina = maxVisina;
        this.listaPlanina = new ArrayList<>();
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxVisina() {
        return maxVisina;
    }

    public void setMaxVisina(double maxVisina) {
        this.maxVisina = maxVisina;
    }

    public boolean uporedi(Planina planina) {
        for (Planina p : listaPlanina) {
            if (p.getNaziv().equals(planina.getNaziv()) && p.getVisina() == planina.getVisina())
                return false;
        }
        return true;
    }

    // Ova klasa takodje ima metode:
    //-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
    public void popniSe(Planina p) {
        if (p.getVisina() <= maxVisina && uporedi(p))
            getListaPlanina().add(p);
    }

    //-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
    public ArrayList<Planina> crnaLista() {
        ArrayList<Planina> zabranjeno = new ArrayList<>();
        for (Planina p : getListaPlanina())
            if (p.getVisina() > maxVisina)
                zabranjeno.add(p);
        return zabranjeno;
    }

    //-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.
    public double ukupnoMetara() {
        double ukupnaVisina = 0;
        for (Planina p : listaPlanina) {
            if (p.getVisina() <= maxVisina)
                ukupnaVisina += p.getVisina();
        }
        return ukupnaVisina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planinar ").append(imePrezime).append(" moze da se popne na maksimalnu visinu: ").append(maxVisina).append("m\n");
        sb.append("Lista planina:\n");
        for (Planina p : listaPlanina)
            sb.append(p.toString()).append("\n");
        sb.append("Ukupna visina svih planina na koje se planinar popeo = ").append(ukupnoMetara()).append("m\n");
        sb.append("Lista planina na koje planinar ne moze da se popne:\n");
        for (Planina p : crnaLista())
            sb.append(p.toString()).append("\n");

        return sb.toString();
    }
}
