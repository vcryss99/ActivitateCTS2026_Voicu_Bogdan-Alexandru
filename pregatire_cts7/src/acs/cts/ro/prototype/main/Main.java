package acs.cts.ro.prototype.main;

import acs.cts.ro.prototype.model.BloodAnalysis;

public class Main {
    public static void main(String[] args) {
        BloodAnalysis bloodAnalysis = new BloodAnalysis("jeanni",100);
        bloodAnalysis.afiseaza();

        BloodAnalysis bloodAnalysis1 = (BloodAnalysis) bloodAnalysis.copiere();
        bloodAnalysis1.afiseaza();
        bloodAnalysis1.setCod(1002);
        bloodAnalysis1.afiseaza();



    }






}
