package acs.ro.cts.builder.model;

import acs.ro.cts.singletone.model.AbstractMembership;

public class FiltruBuilder implements AbstractSearchingFilter{
    private String titlu;
    private String gen;
    private int an;

    Filtru filtru;

    @Override
    public Filtru build() {
        return this.filtru;
    }

    public FiltruBuilder() {
        this.filtru=new Filtru("jeani","jeani",20);
    }

    @Override
    public AbstractSearchingFilter setTitlu(String titlu) {
        this.filtru.setTitlu(titlu);
        return this;
    }

    @Override
    public AbstractSearchingFilter setGen(String gen) {
        this.filtru.setGen(gen);
        return this;
    }

    @Override
    public AbstractSearchingFilter setAn(int an) {
        this.filtru.setAn(an);
        return this;
    }


}
