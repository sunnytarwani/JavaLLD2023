package SOLID_DesignPattern.Behavioural.Structure;

public class ApplyDiscount {

    Discount discount;

    public ApplyDiscount(Discount discount){
        this.discount = discount;
    }

    public void getDiscount(){
        discount.giveDiscount();
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }
}
