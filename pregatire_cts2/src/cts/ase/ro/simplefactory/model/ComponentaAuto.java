package cts.ase.ro.simplefactory.model;

public abstract class ComponentaAuto {
    protected String firma;
    protected int cod;

    public ComponentaAuto(String firma, int cod) {
        this.firma = firma;
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("firma='").append(firma).append('\'');
        sb.append(", cod=").append(cod);
        sb.append('}');
        return sb.toString();
    }


}
