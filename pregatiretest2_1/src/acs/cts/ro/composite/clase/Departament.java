package acs.cts.ro.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements DepartamentAbstract{
    private String nume;
    private List<DepartamentAbstract> listaDepartamente;

    public Departament(String nume) {
        this.nume = nume;
        this.listaDepartamente = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Departament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaDepartamente=").append(listaDepartamente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Departament " +this.nume);
        for (DepartamentAbstract departamentAbstract : listaDepartamente){
            departamentAbstract.afiseazaDetalii();
        }

    }

    @Override
    public void adaugaNod(DepartamentAbstract nod) {
        this.listaDepartamente.add(nod);

    }

    @Override
    public void stergeNod(DepartamentAbstract nod) {
        this.listaDepartamente.remove(nod);

    }

    @Override
    public DepartamentAbstract getNodCopil(int index) {
        return this.listaDepartamente.get(index);
    }
}
