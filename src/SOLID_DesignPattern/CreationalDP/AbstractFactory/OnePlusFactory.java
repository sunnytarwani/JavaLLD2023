package SOLID_DesignPattern.CreationalDP.AbstractFactory;

public class OnePlusFactory extends PhoneStoreFactory{

    @Override
    Phone createPhone(String modelName) {
        if(modelName.trim().equalsIgnoreCase("oneplus8")){
            return new OnePlus8();
        }
        else if(modelName.trim().equalsIgnoreCase("oneplus9")){
            return new OnePlus9();
        }
        else{
            return null;
        }
    }
}
