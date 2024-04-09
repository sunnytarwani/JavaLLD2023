package SOLID_DesignPattern.CreationalDP.AbstractFactory;

public abstract class PhoneStoreFactory {
    public Phone orderPhone(String modelName){
        Phone phone = createPhone(modelName);
        phone.buildPhone();
        phone.assemblePhone();
        phone.packPhoneInBox();
        return phone;
    }

    abstract Phone createPhone(String modelName);
}
