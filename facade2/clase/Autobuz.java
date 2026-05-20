package acs.cts.ro.facade2.clase;

public class Autobuz {
    private int numar;
    private String culoare;

    public Autobuz(int numar, String culoare) {
        this.numar = numar;
        this.culoare = culoare;
    }

    public Autobuz() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numar=").append(numar);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void deschideUsaFata() {
        System.out.println("s a deschis usa fata");
    }
    public void deschideUsaMijloc() {
        System.out.println("s a deschis usa mijloc");
    }
    public void deschideUsaSpate() {
        System.out.println("s a deschis usa spate");
    }

    public void liberUsaFata() {
        System.out.println("s a pus liber usa fata");
    }
    public void liberUsaMijloc() {
        System.out.println("s a pus liber usa mijloc");
    }
    public void liberUsaSpate() {
        System.out.println("s a pus liber usa spate");
    }
}
