package acs.cts.ro.composite2.main;

import acs.cts.ro.composite2.clase.Meniu;
import acs.cts.ro.composite2.clase.MeniuAbstract;
import acs.cts.ro.composite2.clase.Sectiuni;

public class Main {
    public static void main(String[] args) {
        MeniuAbstract meniuAbstract = new Meniu("Jeani");
        MeniuAbstract sectiunea1 = new Sectiuni("ciorab",30);
        MeniuAbstract sectiunea2 = new Sectiuni("qweewq",30);
        MeniuAbstract sectiunea3 = new Sectiuni("asddsa",30);
        MeniuAbstract sectiunea4 = new Sectiuni("hgfd",30);

        meniuAbstract.adaugaNod(sectiunea1);
        meniuAbstract.adaugaNod(sectiunea2);
        meniuAbstract.adaugaNod(sectiunea3);
        meniuAbstract.adaugaNod(sectiunea4);
        meniuAbstract.afiseazaDetalii();
        meniuAbstract.stergeNod(sectiunea2);
        meniuAbstract.afiseazaDetalii();
        System.out.println(meniuAbstract.getNodCopil(2));

        sectiunea2.afiseazaDetalii();



    }
}
