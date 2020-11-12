package nix.service;

import nix.data.abstr.MemberOfAppointment;

public interface AppointmentResponsibilityService <M extends MemberOfAppointment>{
    void startResponsibility(M m);
    void finishResponsibility();
}
