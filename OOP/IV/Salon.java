package domaci.OOP.IV;

import java.util.List;

public class Salon {

    private List<Automobil> listaAutomobila;

    public Salon(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public Salon() {
    }


    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Salon ima sledece automobile:\n");
        for (Automobil a : listaAutomobila)
            sb.append(a.getNaziv()).append("\n");
        return sb.toString();
    }

    //-vratiNajstariji() - koja ce vratiti najstariji automobil po godistu.
    public Automobil vratiNajstariji() {
        Automobil najstariji = listaAutomobila.get(0);
        for (Automobil a : listaAutomobila) {
            if (a.getGodisteAutomobila() < najstariji.getGodisteAutomobila())
                najstariji = a;
        }
        return najstariji;
    }

    //-vratiNajskuplji() - vraca najskuplji auto
    public Automobil vratiNajskuplji() {
        Automobil najskuplji = listaAutomobila.get(0);
        for (Automobil a : listaAutomobila) {
            if (a.getCena() > najskuplji.getCena())
                najskuplji = a;
        }
        return najskuplji;
    }
}
