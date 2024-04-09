package SOLID_DesignPattern.StructuralDP.Decorator;

public class ChocolateSprinkle extends IceCreamDecorator{
    IceCream iceCream;
    public ChocolateSprinkle(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){
        return iceCream.getDescription() + " added with chocolate sprinkle ";
    }

    @Override
    int cost() {
        return iceCream.cost() + 50;
    }
}
