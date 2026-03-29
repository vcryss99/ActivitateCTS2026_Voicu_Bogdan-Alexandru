package cts.voicu.bogdan.g1098.SimpleFactory.model;

import cts.voicu.bogdan.g1098.Prototype.model.IBauturaPresetata;

public class Cafea  extends Bautura implements  IBautura{

    public Cafea(String nume, int volum, int pret) {
        super(nume, volum, pret);
    }

    public Cafea() {
    }

    @Override
    public void preparare() {
        System.out.println("apa boabe lapte");
    }

    @Override
    public String getDetalii() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }


    @Override
    public IBauturaPresetata copiere() {
        Cafea copie =new Cafea();
        copie.nume=this.nume;
        copie.pret=this.pret;
        copie.volum=this.volum;
        return copie;
    }
}