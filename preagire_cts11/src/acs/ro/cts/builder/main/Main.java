package acs.ro.cts.builder.main;

import acs.ro.cts.builder.model.Filtru;
import acs.ro.cts.builder.model.FiltruBuilder;

public class Main {
    public static void main(String[] args) {

        Filtru filtru = new FiltruBuilder().setAn(300).build();

        System.out.println(filtru);

        Filtru filtru1 =new FiltruBuilder().setAn(200).build();

        System.out.println(filtru1);

    }
}
