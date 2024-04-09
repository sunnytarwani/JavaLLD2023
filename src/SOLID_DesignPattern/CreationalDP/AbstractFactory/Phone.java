package SOLID_DesignPattern.CreationalDP.AbstractFactory;

public abstract class Phone {

    String brandName;
    String modelName;
    String bodyType;
    String phoneSize;

    void buildPhone(){

        System.out.println("Building the phone of type : " + brandName);
    }

    void assemblePhone(){
        System.out.println("Assembling all parts of phone");
    }

    void packPhoneInBox(){
        System.out.println("Packing of Phone");
    }
}
