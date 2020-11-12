package nix;

import nix.data.Patient;
import nix.service.DoctorService;
import nix.service.impl.DoctorServiceImpl;

public class Main {

    public static void main(String[] args) {
        DoctorService doctorService = new DoctorServiceImpl();
        doctorService.startAppointment(new Patient());
    }
}
