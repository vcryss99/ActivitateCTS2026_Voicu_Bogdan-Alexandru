package acs.ase.ro.builder.model;

public class Filter {
    private String titlu;
    private String gen;
    private int an;
    private String actor;
    private int rating;
    private String regizor;

    public Filter(String titlu, String gen, int an, String actor, int rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.an = an;
        this.actor = actor;
        this.rating = rating;
        this.regizor = regizor;
    }
    public Filter() {
        this.titlu="";
        this.gen="";
        this.an=0;
        this.actor="";
        this.rating=0;
        this.regizor="";
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Filter{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", an=").append(an);
        sb.append(", actor='").append(actor).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", regizor='").append(regizor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTitlu() {
        return titlu;
    }



    public String getGen() {
        return gen;
    }



    public int getAn() {
        return an;
    }



    public String getActor() {
        return actor;
    }



    public int getRating() {
        return rating;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    public String getRegizor() {
        return regizor;
    }


}
