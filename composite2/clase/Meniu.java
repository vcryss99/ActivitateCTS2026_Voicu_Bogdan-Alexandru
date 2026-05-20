package acs.cts.ro.composite2.clase;

import acs.cts.ro.composite.clase.DepartamentAbstract;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements MeniuAbstract{
    List<MeniuAbstract> lista;
    String nume;

    public Meniu(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meniu{");
        sb.append("lista=").append(lista);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Departament" +this.nume);
        for(MeniuAbstract meniuAbstract : lista){
            meniuAbstract.afiseazaDetalii();
        }


    }

    @Override
    public void adaugaNod(MeniuAbstract meniuAbstract) {
        this.lista.add(meniuAbstract);
    }

    @Override
    public void stergeNod(MeniuAbstract meniuAbstract) {
        this.lista.remove(meniuAbstract);
    }

    @Override
    public MeniuAbstract getNodCopil(int index) {
        return this.lista.get(index);
    }




}
