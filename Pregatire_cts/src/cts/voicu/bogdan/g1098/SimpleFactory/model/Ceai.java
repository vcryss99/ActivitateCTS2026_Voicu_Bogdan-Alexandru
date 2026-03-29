package cts.voicu.bogdan.g1098.SimpleFactory.model;

import cts.voicu.bogdan.g1098.Prototype.model.IBauturaPresetata;

public class Ceai extends Bautura implements IBautura{


    public Ceai(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    public Ceai() {

    }

    @Override
    public void preparare() {
        System.out.println("apa plic");
    }

    @Override
    public String getDetalii() {
        final StringBuilder sb = new StringBuilder("Ceai{");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public double getPret() {
        return 15;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }

    @Override
    public IBauturaPresetata copiere() {
        Ceai copie=new Ceai();
        copie.nume=this.nume;
        copie.pret=this.pret;
        copie.volum=this.volum;
        return copie;
    }
}
