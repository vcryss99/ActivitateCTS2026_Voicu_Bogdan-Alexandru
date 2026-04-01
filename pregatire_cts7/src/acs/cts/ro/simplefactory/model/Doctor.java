package acs.cts.ro.simplefactory.model;

public class Doctor implements IPersonal{
    @Override
    public void rol() {
        System.out.println("sunt doctor");
    }

    public Doctor() {
    }
}
