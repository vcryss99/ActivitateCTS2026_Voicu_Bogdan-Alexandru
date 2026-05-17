package acs.cts.ro.composite.main;

import acs.cts.ro.composite.clase.Departament;
import acs.cts.ro.composite.clase.DepartamentAbstract;
import acs.cts.ro.composite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        DepartamentAbstract departamentAbstract = new Departament("Iosif");
        DepartamentAbstract sectie1= new Sectie("moarte",3);
        DepartamentAbstract sectie2= new Sectie("moarte33",20);
        DepartamentAbstract sectie3= new Sectie("moarte4112",32);

        departamentAbstract.adaugaNod(sectie1);
        departamentAbstract.adaugaNod(sectie2);
        departamentAbstract.adaugaNod(sectie3);

        departamentAbstract.afiseazaDetalii();
        System.out.println(departamentAbstract.getNodCopil(2));

    }
}
