package cts.ase.ro.prototype.main;

import cts.ase.ro.prototype.model.Masina;

public class Main {
    public static void main(String[] args) {
        Masina masina=new Masina("Jaguar",2010);
        Masina masina1=(Masina) masina.copiaza();

        System.out.println(masina);
        masina1.setAnFabricatie(2012);
        masina1.setModel("Renault");
        System.out.println(masina1);
    }
}
