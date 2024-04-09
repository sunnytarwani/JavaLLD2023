package SOLID_DesignPattern.StructuralDP.Decorator;

public class Main {

    public static void main(String[] args) {

        IceCream iceCream = new ButterScotchIceCream();
        iceCream = new ChocolateSprinkle(new RedVelvetSyrup(iceCream));

        System.out.println("desc : " + iceCream.getDescription() + " \n cost : " + iceCream.cost());
    }
}
