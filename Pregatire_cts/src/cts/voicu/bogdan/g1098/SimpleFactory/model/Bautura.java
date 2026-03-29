package cts.voicu.bogdan.g1098.SimpleFactory.model;

import cts.voicu.bogdan.g1098.Prototype.model.IBauturaPresetata;

public abstract class Bautura  implements IBauturaPresetata {

    protected String nume;

    protected int volum;

    protected int pret;

    public Bautura(String nume, int volum, int pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public Bautura() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
