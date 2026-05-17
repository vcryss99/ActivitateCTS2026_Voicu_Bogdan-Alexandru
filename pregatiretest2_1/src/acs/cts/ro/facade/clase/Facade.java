package acs.cts.ro.facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneaza(Pacient pacient){
        if (this.medic.areTrimitere(pacient)) {
            int patLiber = this.salon.getPatLiber();

            if (patLiber > -1) {
                this.salon.ocupaPat(patLiber);
                System.out.println("A fost ocupat patul " + patLiber);
                System.out.println("Pacient internat");
            } else {
                System.out.println("nu s-a gasit un pat liber");
            }
        }

        else{
            System.out.println("ai nevoie de trimitere");

            }



    }
}
