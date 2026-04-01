package acs.cts.ro.builder.model;

public class FiltruBuilder implements AbstractSearchingFilter{
    private Filtru filtru;

    public FiltruBuilder() {
        this.filtru=new Filtru("","",0);
    }

    @Override
    public Filtru build() {
        return this.filtru;
    }

    @Override
    public AbstractSearchingFilter setTitlu(String titlu) {
        this.filtru.setTitlu(titlu);
        return this;
    }

    @Override
    public AbstractSearchingFilter setActor(String actor) {
        this.filtru.setActor(actor);
        return this;
    }

    @Override
    public AbstractSearchingFilter setAn(int an) {
        this.filtru.setAn(an);
        return this;
    }
}
