package cts.ase.ro.prototype.model;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public Masina() {

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IMasina copiaza() {
        Masina copie=new Masina();
        copie.anFabricatie=this.anFabricatie;
        copie.model=this.model;
        return copie;
    }
}
