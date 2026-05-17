package acs.cts.ro.adapter.clase.adapter;

import acs.cts.ro.adapter.clase.spital.Medicament;

public class Adapter extends acs.cts.ro.adapter.clase.farmacie.Medicament{
    private acs.cts.ro.adapter.clase.spital.Medicament medicament;


    public Adapter(Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }
}
