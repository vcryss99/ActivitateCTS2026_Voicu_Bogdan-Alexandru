package acs.cts.ro.simplefactory.main;

import acs.cts.ro.simplefactory.model.Asistent;
import acs.cts.ro.simplefactory.model.IPersonal;
import acs.cts.ro.simplefactory.model.PersonalFactory;
import acs.cts.ro.simplefactory.model.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalFactory personalFactory =new PersonalFactory();

        IPersonal asistent = personalFactory.creeazaPersonal(TipPersonal.Asistent);
        IPersonal doctor = personalFactory.creeazaPersonal(TipPersonal.Doctor);
        IPersonal receptionist = personalFactory.creeazaPersonal(TipPersonal.Receptionist);

        asistent.rol();
        doctor.rol();
        receptionist.rol();


    }
}
