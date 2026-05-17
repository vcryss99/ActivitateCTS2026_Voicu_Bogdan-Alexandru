package acs.cts.ro.decorator.main;

import acs.cts.ro.decorator.clase.NotaDePlata;
import acs.cts.ro.decorator.clase.NotaDePlataAbstract;
import acs.cts.ro.decorator.clase.NotaDePlataFelicitare;

public class Main {
    public static void main(String[] args) {

        NotaDePlataAbstract notaDePlataAbstract = new NotaDePlata(200,"3 mai");
        NotaDePlataAbstract notadeplata = new NotaDePlataFelicitare(notaDePlataAbstract);
        notaDePlataAbstract.printeaza();
        notadeplata.printeaza();
    }
}
