package SOLID_DesignPattern.CreationalDP.Singleton.ThreadSafeEagerWay;

public class App {
    public static void main(String[] args) {

        BURGER burger = BURGER.getBURGER();
        System.out.println(burger.hashCode());

        BURGER burger1 = BURGER.getBURGER();
        System.out.println(burger1.hashCode());
    }
}
