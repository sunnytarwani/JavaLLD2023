package SOLID_DesignPattern.Behavioural.Structure;

public class CouponDiscount implements Discount{

    @Override
    public void giveDiscount() {
        System.out.println("Coupon discount has been applied");
    }
}
