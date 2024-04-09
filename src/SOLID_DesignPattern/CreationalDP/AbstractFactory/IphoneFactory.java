package SOLID_DesignPattern.CreationalDP.AbstractFactory;

public class IphoneFactory extends PhoneStoreFactory{

    @Override
    Phone createPhone(String modelName) {
        if (modelName.trim().equalsIgnoreCase("iphone14")){
            return new Iphone14();
        }
        else if (modelName.trim().equalsIgnoreCase("iphone15")){
            return new Iphone15();
        }
        else{
            return null;
        }
    }
}
