package acs.cts.ro.prototype.model;

public class BloodAnalysis implements Abstract{
    private String nume;
    private int cod;

    private BloodAnalysis() {
    }

    public BloodAnalysis(String nume, int cod) {
        this.nume = nume;
        this.cod = cod;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public Abstract copiere() {
        BloodAnalysis bloodAnalysis = new BloodAnalysis();
        bloodAnalysis.cod=this.cod;
        bloodAnalysis.nume=this.nume;
        return bloodAnalysis;
    }

    @Override
    public void afiseaza() {
        System.out.println(nume+" "+cod);


    }
}
