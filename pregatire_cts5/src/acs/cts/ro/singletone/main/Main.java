package acs.cts.ro.singletone.main;

import acs.cts.ro.singletone.model.Abonament;

public class Main {
    public static void main(String[] args) {

        Abonament abonament =Abonament.getInstanta("Premium",100);

        abonament.afiseazaDetalii();
    }
}
