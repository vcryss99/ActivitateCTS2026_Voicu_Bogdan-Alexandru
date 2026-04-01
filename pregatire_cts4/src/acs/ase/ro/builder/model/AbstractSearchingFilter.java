package acs.ase.ro.builder.model;

public interface AbstractSearchingFilter {
    Filter build();
    AbstractSearchingFilter setTitlu(String titlu);
    AbstractSearchingFilter setGen(String gen);
    AbstractSearchingFilter setAn(int an);
    AbstractSearchingFilter setActor(String actor);
    AbstractSearchingFilter setRating(int rating);
    AbstractSearchingFilter setRegizor(String regizor);
}
