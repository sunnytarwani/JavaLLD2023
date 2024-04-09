package SOLID_DesignPattern.StructuralDP.Decorator;

public class DryFruitsJelly extends IceCreamDecorator{
    IceCream iceCream;

    public DryFruitsJelly(IceCream iceCream){

        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){

        return iceCream.getDescription() + " added with dry fruit jelly ";
    }
    @Override
    int cost() {

        return iceCream.cost() + 40;
    }
}
