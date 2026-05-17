package acs.cts.ro.adapter2.Main;

import acs.cts.ro.adapter2.clase.adapter.Adapter;
import acs.cts.ro.adapter2.clase.liceu.Elev;

public class Main {
    public static void main(String[] args) {

        Adapter adapter = new Adapter(new Elev("jeani"));
        adapter.scoalaElev();


    }
}
