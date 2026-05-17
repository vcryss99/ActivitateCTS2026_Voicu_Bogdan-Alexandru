package acs.cts.ro.facade.main;

import acs.cts.ro.facade.clase.Facade;
import acs.cts.ro.facade.clase.Medic;
import acs.cts.ro.facade.clase.Pacient;
import acs.cts.ro.facade.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon();
        Medic medic = new Medic();
        Pacient pacient = new Pacient("jeani",10);

        Facade facade = new Facade(medic,salon);
        facade.interneaza(pacient);

    }
}
