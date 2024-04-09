package SOLID_DesignPattern.StructuralDP.Decorator;

public abstract class IceCream {

    String description;
    String getDescription(){
        return description;
    }

    abstract int cost();
}
