package acs.cts.ro.composite.clase;

public interface DepartamentAbstract {
    void afiseazaDetalii();
    void adaugaNod(DepartamentAbstract nod);
    void stergeNod(DepartamentAbstract nod);
    DepartamentAbstract getNodCopil(int index);
}
