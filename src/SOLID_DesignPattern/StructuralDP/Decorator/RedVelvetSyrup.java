package SOLID_DesignPattern.StructuralDP.Decorator;

public class RedVelvetSyrup extends IceCreamDecorator{
    IceCream iceCream;

    public RedVelvetSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    String getDescription(){
        return iceCream.getDescription() + " added with redvelvet syrup ";
    }
    @Override
    int cost() {
        return iceCream.cost() + 45;
    }
}
