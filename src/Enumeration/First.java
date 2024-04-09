package Enumeration;

enum Status{
    Success,
    Failed,
    Pending,
    Running;

}

enum Laptop{
    HP(2000),
    Macbook(5000),
    Lenovo(3500),
    Asus(1000);
    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class First {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s.ordinal());

        for(Laptop l : Laptop.values()){
            System.out.println(l +" "+l.getPrice());
        }
    }
}
