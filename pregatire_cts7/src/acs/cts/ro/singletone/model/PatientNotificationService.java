package acs.cts.ro.singletone.model;

public class PatientNotificationService implements IHospitalService{

    private String nume;
    private int data;
    private static PatientNotificationService instance =null;

    private PatientNotificationService(String nume, int data) {
        this.nume = nume;
        this.data = data;
    }

    public static synchronized PatientNotificationService getInstance(String nume, int data) {
        if (instance == null)
        {
            instance = new PatientNotificationService(nume, data);
        }
        return instance;
    }

    @Override
    public void getServiced() {
        System.out.println(this.nume+" "+this.data);

    }
}
