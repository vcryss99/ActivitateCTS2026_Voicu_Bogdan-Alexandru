package acs.cts.ro.builder.main;

import acs.cts.ro.builder.model.Filtru;
import acs.cts.ro.builder.model.FiltruBuilder;

public class Main {
    public static void main(String[] args) {
        Filtru filtru = new FiltruBuilder().setActor("jickychan").setAn(300).build();

        System.out.println(filtru);
    }
}
