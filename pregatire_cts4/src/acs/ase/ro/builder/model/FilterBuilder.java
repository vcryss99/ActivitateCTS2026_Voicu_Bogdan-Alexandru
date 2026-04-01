package acs.ase.ro.builder.model;

public class FilterBuilder implements AbstractSearchingFilter{
    private Filter filter;
    private String titlu;
    private String gen;
    private int an;
    private String actor;
    private int rating;
    private String regizor;



    public FilterBuilder() {
        this.filter = new Filter();
    }

    public FilterBuilder(String titlu, String gen, int an, String actor, int rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.an = an;
        this.actor = actor;
        this.rating = rating;
        this.regizor = regizor;
    }

    @Override
    public Filter build() {
        return this.filter;
    }

    @Override
    public AbstractSearchingFilter setTitlu(String titlu) {
        this.titlu=titlu;
        return this;
    }

    @Override
    public AbstractSearchingFilter setGen(String gen) {
        this.gen=gen;
        return this;
    }

    @Override
    public AbstractSearchingFilter setAn(int an) {
        this.an=an;
        return null;
    }

    @Override
    public AbstractSearchingFilter setActor(String actor) {
        this.filter.setActor(actor);
        return this;
    }

    @Override
    public AbstractSearchingFilter setRating(int rating) {
        this.rating=rating;
        return this;
    }

    @Override
    public AbstractSearchingFilter setRegizor(String regizor) {
        this.regizor=regizor;
        return this;
    }


}
