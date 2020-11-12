package nix.service.impl;

import nix.config.ObjectFactory;
import nix.data.Patient;
import nix.service.DoctorResponsibilityService;
import nix.service.WorkEnvironmentService;

public class DoctorResponsibilityServiceImpl  implements DoctorResponsibilityService {
    private WorkEnvironmentService workEnvironmentService = ObjectFactory.getInstance().createObject(WorkEnvironmentService.class);

    @Override
    public void startResponsibility(Patient patient){
        workEnvironmentService.check();
        System.out.println("Дожидается пациента");
        System.out.println("Спрашивает о симптомах");
    }
    @Override
    public void finishResponsibility(){
        System.out.println("Прописывает лечение");
    }
}
