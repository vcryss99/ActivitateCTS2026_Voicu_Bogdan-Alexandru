package acs.cts.ro.adapter2.clase.scoala;

public class Elev {
    String nume;

    public Elev(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void scoalaElev(){
        System.out.println("Acest elev este la scoala");
    }
}
