package acs.cts.ro.composite2.clase;

public class Sectiuni implements MeniuAbstract{
    private String preparat;
    private int pret;


    public Sectiuni(String preparat, int pret) {
        this.preparat = preparat;
        this.pret = pret;
    }



    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sectiuni{");
        sb.append("preparat='").append(preparat).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        System.out.println(sb);

    }

    @Override
    public void adaugaNod(MeniuAbstract meniuAbstract) {
        throw new UnsupportedOperationException("nup");
    }

    @Override
    public void stergeNod(MeniuAbstract meniuAbstract) {
        throw new UnsupportedOperationException("nup");
    }

    @Override
    public MeniuAbstract getNodCopil(int index) {
        throw new UnsupportedOperationException("nup");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectiuni{");
        sb.append("preparat='").append(preparat).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
