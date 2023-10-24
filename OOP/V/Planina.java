package domaci.OOP.V;

public class Planina {

    //Napraviti klasu Planina koja ima vrednosti za naziv planine i njenu visinu.

    private String naziv;
    private double visina;

    public Planina(String naziv, double visina) {
        this.naziv = naziv;
        this.visina = visina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planina: ").append(naziv).append(", visina: ").append(visina).append("m");
        return sb.toString();
    }
}
