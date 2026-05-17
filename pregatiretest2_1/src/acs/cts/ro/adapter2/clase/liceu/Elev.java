package acs.cts.ro.adapter2.clase.liceu;

public class Elev {
    String nume;

    public Elev(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void liceuElev(){
        System.out.println("Acest elev este la liceu");
    }
}
