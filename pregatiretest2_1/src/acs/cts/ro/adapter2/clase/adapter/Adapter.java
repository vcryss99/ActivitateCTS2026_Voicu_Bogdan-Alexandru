package acs.cts.ro.adapter2.clase.adapter;

import acs.cts.ro.adapter2.clase.liceu.Elev;

public class Adapter extends acs.cts.ro.adapter2.clase.scoala.Elev{
    private acs.cts.ro.adapter2.clase.liceu.Elev elev ;


    public Adapter(acs.cts.ro.adapter2.clase.liceu.Elev elev) {
        super(elev.getNume());
        this.elev = elev;
    }
}
