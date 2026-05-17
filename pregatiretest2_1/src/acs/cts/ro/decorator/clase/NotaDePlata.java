package acs.cts.ro.decorator.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private int valore;
    private String data;

    public NotaDePlata(int valore, String data) {
        this.valore = valore;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("Suma de plata este " + this.valore +" la data de " +this.data);

    }
}
