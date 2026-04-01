package acs.ase.ro.singletone.model;

public class AbonamentLunar implements AbstractMemebership{

    private int pret;
    private String denumire;

    private static AbonamentLunar instanta=null;

    private AbonamentLunar(int pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public static synchronized AbonamentLunar getInstanta(int pret, String denumire) {
        if (instanta == null)
            instanta = new AbonamentLunar(pret, denumire);
        return instanta;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("TIP "+this.denumire+" Pret "+this.pret);

    }
}
