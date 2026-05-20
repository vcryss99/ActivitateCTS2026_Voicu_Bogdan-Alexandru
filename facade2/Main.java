package acs.cts.ro.facade2;

import acs.cts.ro.facade2.clase.Autobuz;
import acs.cts.ro.facade2.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Facade facade = new Facade(autobuz);
        facade.deschideUsi();
        facade.inchideUsi();
    }
}
