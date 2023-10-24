package domaci.OOP.V;

import java.util.ArrayList;

public class Amater extends Planinar {


    public Amater(String imePrezime, ArrayList<Planina> listaPlanina) {
        super(imePrezime, listaPlanina, 1000);
    }

    public Amater(String imePrezime) {
        super(imePrezime, 1000);
    }

}
