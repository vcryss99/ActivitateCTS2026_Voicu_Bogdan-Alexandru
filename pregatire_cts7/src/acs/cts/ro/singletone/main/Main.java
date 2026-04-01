package acs.cts.ro.singletone.main;

import acs.cts.ro.singletone.model.IHospitalService;
import acs.cts.ro.singletone.model.PatientNotificationService;

public class Main {
    public static void main(String[] args) {

        IHospitalService service = PatientNotificationService.getInstance("jeani",100);
        service.getServiced();

        IHospitalService service2 = PatientNotificationService.getInstance("abdur",1002);
        service2.getServiced();


    }
}
