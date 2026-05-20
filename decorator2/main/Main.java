package acs.cts.ro.decorator2.main;

import acs.cts.ro.decorator2.clase.NotaDePlata;
import acs.cts.ro.decorator2.clase.NotaDePlata1Mai;
import acs.cts.ro.decorator2.clase.NotaDePlataAbstracta;
import acs.cts.ro.decorator2.clase.NotaDePlataDecorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstracta notaDePlata = new NotaDePlata(30);
        notaDePlata.afiseazaDetalii();

        NotaDePlataDecorator notadeplataDecorator = new NotaDePlata1Mai(notaDePlata);
        notadeplataDecorator.afiseazaDetalii1Mai();
        notadeplataDecorator.afiseazaDetalii();
    }
}
