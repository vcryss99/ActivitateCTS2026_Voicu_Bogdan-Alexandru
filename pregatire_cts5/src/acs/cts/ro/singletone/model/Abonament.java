package acs.cts.ro.singletone.model;

public class Abonament implements AbstractMemebership{
    private String denumire;
    private int cost;
    private static Abonament instanta = null;

    private Abonament() {
    }

    private Abonament(String denumire, int cost) {
        this.denumire = denumire;
        this.cost = cost;
    }

    public static synchronized Abonament getInstanta(String denumire , int cost) {
        if (instanta == null)
        {
            instanta = new Abonament(denumire, cost);
        }

        return instanta;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Detalii "+ "Denumire "+denumire+" Cost: "+cost);
    }
}
