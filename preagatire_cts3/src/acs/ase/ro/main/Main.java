package acs.ase.ro.main;

import acs.ase.ro.model.ManagementCuptor;

public class Main {
    public static void main(String[] args) {
        ManagementCuptor cuptor1=ManagementCuptor.getInstanta(100,50);
        cuptor1.adaugaInLista("pizza");

        System.out.println(cuptor1.getGrade());

        ManagementCuptor cuptor2 = ManagementCuptor.getInstanta(150, 10);
        cuptor2.adaugaInLista("Bezele");

        System.out.println(cuptor2.getGrade());

        System.out.println(cuptor2.getGrade());

        System.out.println(cuptor2.getListaAsteptare());

        cuptor1.setGrade(1000);
        System.out.println(cuptor1.getGrade());
    }
}
