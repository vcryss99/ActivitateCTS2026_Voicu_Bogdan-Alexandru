package acs.ase.ro.builder.main;

import acs.ase.ro.builder.model.Filter;
import acs.ase.ro.builder.model.FilterBuilder;

public class Main {
    public static void main(String[] args) {
        Filter filter = new FilterBuilder().setActor("MUIEEHUJIWQERBHGJKVEQAWVGHEFVGHJASasdvgbhj").build();
        System.out.println(filter);
        filter.setActor("jeani");
        System.out.println(filter);
    }
}
