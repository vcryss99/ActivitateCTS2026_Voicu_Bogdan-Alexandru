package acs.ro.cts.singletone.main;

import acs.ro.cts.singletone.model.Membership;

public class Main {
    public static void main(String[] args) {

        Membership abonament = Membership.getInstanta("Lux",100);
        abonament.detalii();

        Membership abonament2 = Membership.getInstanta("Jeani",1000);
        abonament2.detalii();

        Membership abonament3 = Membership.getInstanta("Jeani",10000);
        abonament3.detalii();

    }
}
