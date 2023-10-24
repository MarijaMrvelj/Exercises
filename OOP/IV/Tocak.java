package domaci.OOP.IV;

public class Tocak {

    private int trajanjeTocka;
    private double cenaTocka;

    public Tocak(int trajanjeTocka, double cenaTocka) {
        this.trajanjeTocka = trajanjeTocka;
        this.cenaTocka = cenaTocka;
    }

    public Tocak(int trajanjeTocka) {
        this.trajanjeTocka = trajanjeTocka;
    }

    public Tocak() {
    }

    public int getTrajanjeTocka() {
        return trajanjeTocka;
    }

    public void setTrajanjeTocka(int trajanjeTocka) {
        this.trajanjeTocka = trajanjeTocka;
    }

    public double getCenaTocka() {
        return cenaTocka;
    }

    public void setCenaTocka(double cenaTocka) {
        this.cenaTocka = cenaTocka;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trajanje tocka: ").append(trajanjeTocka).append(" | ");
        sb.append("Cena tocka: ").append(cenaTocka);
        return sb.toString();
    }
}
