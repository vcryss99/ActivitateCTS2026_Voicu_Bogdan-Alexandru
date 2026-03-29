package cts.ase.ro.simplefactory.model;

public class Portbagaj extends ComponentaAuto implements IComponenta{
    public Portbagaj(String firma, int cod) {
        super(firma, cod);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portbagaj{");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void afisareDetalii() {
        System.out.println(this.cod);
    }


}
