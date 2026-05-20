package acs.cts.ro.decorator2.clase;

public class NotaDePlata implements NotaDePlataAbstracta{
    int suma;

    public NotaDePlata(int suma) {
        this.suma = suma;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("suma este " +this.suma );
    }
}
