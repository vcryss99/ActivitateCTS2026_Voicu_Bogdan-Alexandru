package cts.voicu.bogdan.g1098.Prototype.main;

import cts.voicu.bogdan.g1098.Prototype.model.IBauturaPresetata;
import cts.voicu.bogdan.g1098.SimpleFactory.model.BauturaFactory;
import cts.voicu.bogdan.g1098.SimpleFactory.model.Cafea;
import cts.voicu.bogdan.g1098.SimpleFactory.model.Ceai;
import cts.voicu.bogdan.g1098.SimpleFactory.model.TipBautura;

public class Main {
    public static void main(String[] args) {
        BauturaFactory factory =new BauturaFactory();
        IBauturaPresetata cafea =(IBauturaPresetata) factory.creazaBautura(TipBautura.Cafea,"verde",3,2);
        IBauturaPresetata ceai =(IBauturaPresetata) factory.creazaBautura(TipBautura.Ceai,"rosu",3,3);

        IBauturaPresetata cafea2=cafea.copiere();
        IBauturaPresetata ceai2 =ceai.copiere();
        ((Ceai)ceai2).preparare();
        ((Cafea)cafea2).preparare();
    }
}
