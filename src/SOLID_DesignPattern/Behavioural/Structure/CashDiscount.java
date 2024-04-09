package SOLID_DesignPattern.Behavioural.Structure;

public class CashDiscount implements Discount{

    @Override
    public void giveDiscount() {
        System.out.println("Cash discount has been applied");
    }

}
