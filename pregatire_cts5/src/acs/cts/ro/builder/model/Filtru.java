package acs.cts.ro.builder.model;

public class Filtru {
    private String titlu;
    private String actor;
    private int an;

    public Filtru(String titlu, String actor, int an) {
        this.titlu = titlu;
        this.actor = actor;
        this.an = an;
    }

    public Filtru() {
        this.titlu="";
        this.actor="";
        this.an=0;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
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
        sb.append(", actor='").append(actor).append('\'');
        sb.append(", an=").append(an);
        sb.append('}');
        return sb.toString();
    }
}
