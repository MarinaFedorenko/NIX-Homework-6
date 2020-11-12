package nix.service.impl;

import nix.config.ObjectFactory;
import nix.data.Patient;
import nix.service.CabinetService;
import nix.service.DoctorResponsibilityService;
import nix.service.DoctorService;

public class DoctorServiceImpl implements DoctorService <Patient> {

    private CabinetService cabinetService = ObjectFactory.getInstance().createObject(CabinetService.class);
    private DoctorResponsibilityService doctorResponsibilityService = ObjectFactory.getInstance().createObject(DoctorResponsibilityService.class);

    public void startAppointment(Patient patient){
        cabinetService.isExist();
        doctorResponsibilityService.startResponsibility(patient);
        treat(patient);
        doctorResponsibilityService.finishResponsibility();
    }

    public void treat (Patient patient){
        System.out.println("Спрашивает о симптомах");
        System.out.println("Проверяет показатели здоровья");
        System.out.println("Прописывает лечение");

    }

}
