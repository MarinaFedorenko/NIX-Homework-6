package nix.service.impl;

import nix.exception.CabinetException;
import nix.service.CabinetService;

public class WorkProcessServiceImpl implements CabinetService {
    private boolean existCabinet = true;
    private boolean hospitalWorked = true;

    @Override
    public void isExist(){
        if(existCabinet){
            System.out.println("Кабинет имеется");
        } else{
            throw new CabinetException("Кабинет не имеется");
        }
        if(hospitalWorked){
            System.out.println("Больница работает");
        } else{
            throw new CabinetException("Больница не работает");
        }
    }
}
