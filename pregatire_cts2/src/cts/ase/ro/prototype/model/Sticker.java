package cts.ase.ro.prototype.model;

public class Sticker {
    Masina masina;
    int latime;
    int lungime;

    public Sticker(Masina masina, int latime, int lungime) {
        this.masina = masina;
        this.latime = latime;
        this.lungime = lungime;
    }

    public Sticker() {
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("masina=").append(masina);
        sb.append(", latime=").append(latime);
        sb.append(", lungime=").append(lungime);
        sb.append('}');
        return sb.toString();
    }
}
