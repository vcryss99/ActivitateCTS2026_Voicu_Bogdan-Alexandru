package acs.ro.cts.builder.model;

import acs.ro.cts.singletone.model.AbstractMembership;

public interface AbstractSearchingFilter {
    Filtru build();
    AbstractSearchingFilter setTitlu(String titlu);
    AbstractSearchingFilter setGen(String gen);
    AbstractSearchingFilter setAn(int an);
}
