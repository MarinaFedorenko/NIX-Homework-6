package nix.service;

import nix.data.abstr.MemberOfAppointment;

public interface DoctorService <M extends MemberOfAppointment> {
    void startAppointment(M m);
}
