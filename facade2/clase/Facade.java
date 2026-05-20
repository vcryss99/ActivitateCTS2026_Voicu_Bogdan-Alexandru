package acs.cts.ro.facade2.clase;

public class Facade {
    private Autobuz autobuz;

    public Facade(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideUsi(){
        this.autobuz.deschideUsaFata();
        this.autobuz.deschideUsaMijloc();
        this.autobuz.deschideUsaSpate();

    }

    public void inchideUsi(){
        this.autobuz.liberUsaFata();
        this.autobuz.liberUsaMijloc();
        this.autobuz.liberUsaSpate();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Facade{");
        sb.append("autobuz=").append(autobuz);
        sb.append('}');
        return sb.toString();
    }
}
