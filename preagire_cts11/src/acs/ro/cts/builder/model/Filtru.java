package acs.ro.cts.builder.model;

public class Filtru {
    private String titlu;
    private String gen;
    private int an;

    public Filtru() {
        this.titlu="";
        this.gen="";
        this.an=0;
    }

    public Filtru(String titlu, String gen, int an) {
        this.titlu = titlu;
        this.gen = gen;
        this.an = an;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Filtru{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", an=").append(an);
        sb.append('}');
        return sb.toString();
    }
}
