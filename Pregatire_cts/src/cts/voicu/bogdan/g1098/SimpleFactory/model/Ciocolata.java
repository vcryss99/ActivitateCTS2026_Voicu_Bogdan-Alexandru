package cts.voicu.bogdan.g1098.SimpleFactory.model;

import cts.voicu.bogdan.g1098.Prototype.model.IBauturaPresetata;

public class Ciocolata extends Bautura implements IBautura{

    public Ciocolata(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    public Ciocolata() {

    }

    @Override
    public void preparare() {
        System.out.println("topesti ciolata pui apa");

    }

    @Override
    public String getDetalii() {
        final StringBuilder sb = new StringBuilder("Ciocolata{");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public double getPret() {
        return 10;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }

    @Override
    public IBauturaPresetata copiere() {
        Ciocolata copie=new Ciocolata();
        copie.nume=this.nume;
        copie.pret=this.pret;
        copie.volum=this.volum;
        return copie;
    }
}
