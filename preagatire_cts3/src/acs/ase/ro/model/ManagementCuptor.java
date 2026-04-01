package acs.ase.ro.model;

import java.util.ArrayList;
import java.util.List;

public class ManagementCuptor {
    private int grade;
    private int timp;
    private List<String> listaAsteptare;

    private static ManagementCuptor instanta = null;

    private ManagementCuptor(int grade, int timp) {
        this.grade = grade;
        this.timp = timp;

        this.listaAsteptare = new ArrayList<>();
    }


    public void adaugaInLista(String numePreparat) {
        this.listaAsteptare.add(numePreparat + " (" + this.grade + "°C, " + this.timp + " min)");
    }


    public List<String> getListaAsteptare() {
        return new ArrayList<>(listaAsteptare);
    }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    public int getTimp() { return timp; }
    public void setTimp(int timp) { this.timp = timp; }

    public static synchronized ManagementCuptor getInstanta(int grade, int timp) {
        if (instanta == null) {
            instanta = new ManagementCuptor(grade, timp);
        }
        return instanta;
    }
}