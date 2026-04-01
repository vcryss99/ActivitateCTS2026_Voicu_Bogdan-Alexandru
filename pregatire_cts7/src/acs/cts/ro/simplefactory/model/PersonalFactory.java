package acs.cts.ro.simplefactory.model;

public class PersonalFactory {
    public IPersonal creeazaPersonal(TipPersonal tipPersonal)
    {
        return switch (tipPersonal){
            case Doctor -> new Doctor();
            case Asistent -> new Asistent();
            case Receptionist -> new Receptionist();
        };
    };
}
