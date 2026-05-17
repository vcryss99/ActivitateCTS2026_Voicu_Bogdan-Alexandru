package acs.cts.ro.adapter.clase.spital;

public class Medicament {
    private String nume;
    private int pret;


    public Medicament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicament(){
        if (this.prezintaReteta()) {
            System.out.println("ai achizitionat medicament de la spital");
        }
        else
        {
            System.out.println("n are smr mama");
        }
    }

    public boolean prezintaReteta(){
        return this.nume.length() >10;
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
