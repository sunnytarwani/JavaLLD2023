package SOLID_DesignPattern.StructuralDP.Decorator;

public class ButterScotchIceCream extends IceCream{

    @Override
    String getDescription(){
        return "Butter Scotch";
    }

    @Override
    int cost() {
        return 80;
    }
}
