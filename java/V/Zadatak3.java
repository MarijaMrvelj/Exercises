package domaci.java.V;

public class Zadatak3 {

    static int duplikati(String[] s) {
        int brojDuplikata = 0;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    brojDuplikata++;
                    break;
                }
            }
        }
        return brojDuplikata;
    }

    //Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat vraca broj duplikata imena (Ukoliko ih ima).

    public static void main(String[] args) {

       String[] imena1 = {"Ana", "Mina", "Marko", "Stefan", "Ana"};
        String[] imena2 = {"Jelena", "Stefan", "Djordje", "Jelena", "Jelena", "Stefan"};

        for (String e : imena1)
            System.out.println(e + " ");
        System.out.println("Broj duplikata = " + duplikati(imena1));

        for (String e : imena2)
            System.out.println(e + " ");
        System.out.println("Broj duplikata = " + duplikati(imena2));
    }
}

    /*
    Spoljna petlja (for petlja sa promenljivom i):

int i = 0;: Početna vrednost promenljive i koja će služiti kao indeks prve iteracije kroz niz s.
i < s.length - 1;: Uslov koji govori da se spoljna petlja izvršava sve dok vrednost i ne dosegne indeks pre poslednjeg elementa niza.
Ovo je zato što nakon poslednje iteracije spoljne petlje, unutrašnja petlja neće imati s kim da uporedi poslednji element.
i++: Inkrementiranje vrednosti promenljive i nakon svake iteracije.
Unutrašnja petlja (for petlja sa promenljivom j):

int j = i + 1;: Početna vrednost promenljive j koja će služiti kao indeks za poređenje sa elementima nakon trenutnog indeksa i.
j < s.length;: Uslov koji govori da se unutrašnja petlja izvršava sve dok vrednost j ne dosegne indeks poslednjeg elementa niza.
j++: Inkrementiranje vrednosti promenljive j nakon svake iteracije.
Provera duplikata (if uslov):

s[i].equals(s[j]): Uslov koji proverava da li se element na poziciji i i element na poziciji j podudaraju (to jest, da li su isti).
Ako se poklapaju, to znači da imamo duplikat.
brojDuplikata++: Ako se elementi poklapaju, inkrementira se brojčanik
     */