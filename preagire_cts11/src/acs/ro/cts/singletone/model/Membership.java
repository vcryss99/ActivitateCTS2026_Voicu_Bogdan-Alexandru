package acs.ro.cts.singletone.model;

public class Membership implements AbstractMembership{
    private String denumire;
    private int cost;
    private static Membership instanta =null;

    private Membership() {
    }

    private Membership(String denumire, int cost) {
        this.denumire = denumire;
        this.cost = cost;
    }

    public static synchronized Membership getInstanta(String denumire , int cost) {
        if (instanta == null)
        {
            instanta=new Membership(denumire, cost);
        }
        return instanta;
    }

    @Override
    public void detalii() {
        System.out.println("Detalii: "+this.denumire+ " costuri: "+this.cost);
    }

}
