package acs.cts.ro.adapter.clase.farmacie;

public class Medicament {
    private String nume;
    private int pret;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void achizitiiMedicament(){
        System.out.printf("Medicamentul %s a fost achizitionat!%n", this.nume);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
