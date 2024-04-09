package SOLID_DesignPattern.CreationalDP.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        PhoneStoreFactory phoneStoreFactory = new IphoneFactory();
        phoneStoreFactory.orderPhone("iphone14");
    }
}
