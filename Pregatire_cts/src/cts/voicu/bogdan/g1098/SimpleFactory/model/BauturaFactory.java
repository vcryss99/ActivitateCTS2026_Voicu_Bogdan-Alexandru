package cts.voicu.bogdan.g1098.SimpleFactory.model;

public class BauturaFactory {
    public IBautura creazaBautura(TipBautura tipBautura ,String nume, int volum , int pret){
        return switch (tipBautura){
            case Cafea -> new Cafea(nume, volum, pret);
            case Ceai -> new Ceai(nume, volum, pret);
            case Ciocolata -> new Ciocolata(nume, volum, pret);
        };
    }
}
