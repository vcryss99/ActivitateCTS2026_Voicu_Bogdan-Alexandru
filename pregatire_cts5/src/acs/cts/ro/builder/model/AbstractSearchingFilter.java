package acs.cts.ro.builder.model;

import acs.cts.ro.singletone.model.AbstractMemebership;

public interface AbstractSearchingFilter {
    Filtru build();
    AbstractSearchingFilter setTitlu(String titlu);
    AbstractSearchingFilter setActor(String actor);
    AbstractSearchingFilter setAn(int an);
}
