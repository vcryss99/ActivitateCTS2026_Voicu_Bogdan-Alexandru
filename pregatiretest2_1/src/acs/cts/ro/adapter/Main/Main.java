package acs.cts.ro.adapter.Main;

import acs.cts.ro.adapter.clase.adapter.Adapter;
import acs.cts.ro.adapter.clase.spital.Medicament;

public class Main {
    public static void main(String[] args) {

        Medicament medicament = new Medicament("jeaninanananna");
        acs.cts.ro.adapter.clase.farmacie.Medicament medicament1 = new acs.cts.ro.adapter.clase.farmacie.Medicament("hanina");

        medicament1.achizitiiMedicament();
        medicament.achizitioneazaMedicament();

        Adapter adapter = new Adapter(medicament);
        adapter.achizitiiMedicament();



    }
}
