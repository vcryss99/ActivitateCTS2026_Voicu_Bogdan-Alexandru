package acs.cts.ro.facade.clase;

public class Medic {
    public boolean areTrimitere(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
