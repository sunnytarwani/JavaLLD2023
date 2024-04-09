package SOLID_DesignPattern.Behavioural.Structure;

public class Client {

    public static void main(String[] args) {
        ApplyDiscount applyDiscount = new ApplyDiscount(new FlatDiscount());
        applyDiscount.getDiscount();

        applyDiscount.setDiscount(new CashDiscount());
        applyDiscount.getDiscount();
    }
}
