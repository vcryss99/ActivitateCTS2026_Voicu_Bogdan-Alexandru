package acs.cts.ro.composite.clase;

public class Sectie implements DepartamentAbstract{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Sectie " + this.nume);

    }

    @Override
    public void adaugaNod(DepartamentAbstract nod) {
        throw new UnsupportedOperationException("nu ai voie");
    }

    @Override
    public void stergeNod(DepartamentAbstract nod) {
        throw new UnsupportedOperationException("nu ai voie");

    }

    @Override
    public DepartamentAbstract getNodCopil(int index) {
        throw new UnsupportedOperationException("nu ai voie");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
