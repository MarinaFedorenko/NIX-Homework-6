package nix.service.impl;

import nix.annotation.Value;
import nix.service.WorkEnvironmentService;

public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    //@Value("idea")
    @Value
    private String ide;

    @Override
    public void check() {
        System.out.println("Рабочий день начался, "+ ide + " получены");

    }
}
