package cts.voicu.bogdan.g1098.SimpleFactory.main;

import cts.voicu.bogdan.g1098.SimpleFactory.model.BauturaFactory;
import cts.voicu.bogdan.g1098.SimpleFactory.model.IBautura;
import cts.voicu.bogdan.g1098.SimpleFactory.model.TipBautura;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory = new BauturaFactory();

        IBautura cafea = factory.creazaBautura(TipBautura.Cafea,"jeani",3,3);
        IBautura ceai = factory.creazaBautura(TipBautura.Ceai,"aromat",3,3);
        IBautura ciocolata =factory.creazaBautura(TipBautura.Ciocolata,"calda",3,3);

        cafea.preparare();
        ceai.preparare();
        ciocolata.preparare();

        System.out.println(cafea.getDetalii());
        cafea.getPret();

    }
}
