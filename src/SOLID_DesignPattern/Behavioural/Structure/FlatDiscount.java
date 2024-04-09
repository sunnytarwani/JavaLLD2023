package SOLID_DesignPattern.Behavioural.Structure;

public class FlatDiscount implements Discount{

    @Override
    public void giveDiscount() {
        System.out.println("Flat discount has been applied");
    }
}
