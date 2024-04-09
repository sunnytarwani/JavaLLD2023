package SOLID_DesignPattern.StructuralDP.Decorator;

public class BananaWaffleIceCream extends IceCream {

    @Override
    String getDescription(){
        return "Banana Waffle";
    }

    @Override
    int cost() {
        return 85;
    }
}
