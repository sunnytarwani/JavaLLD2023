package SOLID_DesignPattern.CreationalDP.BuilderDP;

public class MacD {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .setBurgerName("Big Mac")
                .setAddFries(true)
                .setBurgerSize("5 inch")
                .build();

        System.out.println(burger);
    }
}
