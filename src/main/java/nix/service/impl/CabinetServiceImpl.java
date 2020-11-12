package nix.service.impl;

import nix.exception.CabinetException;
import nix.service.CabinetService;

public class CabinetServiceImpl  implements CabinetService {

    private boolean existCabinet = true;

    @Override
    public void isExist(){
        if(existCabinet){
            System.out.println("Кабинет имеется");
        } else{
            throw new CabinetException("Кабинет не имеется");
        }
    }
}
