package acs.ase.ro.singletone.main;

import acs.ase.ro.singletone.model.AbonamentLunar;

public class Main {
    public static void main(String[] args) {
        AbonamentLunar abonament1 = AbonamentLunar.getInstanta(100,"Premium");
        abonament1.detaliiAbonament();
        AbonamentLunar abonament2 = AbonamentLunar.getInstanta(300,"vip");
        abonament2.detaliiAbonament();

        abonament1.setDenumire("Ultra");
        abonament1.setPret(500);
        abonament1.detaliiAbonament();

    }
}
