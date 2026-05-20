package acs.cts.ro.composite2.clase;

public interface MeniuAbstract {
    void afiseazaDetalii();
    void adaugaNod(MeniuAbstract meniuAbstract);
    void stergeNod(MeniuAbstract meniuAbstract);
    MeniuAbstract getNodCopil(int index);
}
