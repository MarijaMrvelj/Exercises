package domaci.OOP.I;

import java.util.ArrayList;

/*
Zadatak 1:
Kreirati klasu Korpa koja ima listu namirnica(String). Kreirati:
- metodu koja prima neku namirnicu i dodaje je u listu
- metodu koja za unetu namirnicu vraca true/false ukoliko se namirnica tu nalazi.
- metodu cenaKorpe koja vraca ukupnu cenu svih namirnica ako racunamo da je prosek jedne namirnice 70 dinara
- metodu izlistaj koja prikazuje sve namirnice iz liste
Takodje kreirati potreban konstruktor, get i set metode kao i toString.
 */
public class Korpa {

    ArrayList<String> listaNamirnica;

    public Korpa(ArrayList<String> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    public ArrayList<String> getListaNamirnica() {
        return listaNamirnica;
    }

    public void setListaNamirnica(ArrayList<String> listaNamirnica) {
        this.listaNamirnica = listaNamirnica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Broj namirnica u listi je ").append(listaNamirnica.size()).append(".\n");
        sb.append("Lista namirnica: ").append(listaNamirnica).append("\n");
        sb.append("Ukupna cena svih namirnica je ").append(cenaKorpe()).append(" dinara.");
        return sb.toString();
    }


    public void dodajNamirnicu(String namirnica) {
        listaNamirnica.add(namirnica);
    }

    public boolean daLiJeNamirnicaUListi(String namirnica) {

        return listaNamirnica.contains(namirnica);
    }

    public int cenaKorpe() {
        return 70 * listaNamirnica.size();
    }

    public void izlistaj() {
        System.out.println("Lista namirnica: " + listaNamirnica);
    }

}
