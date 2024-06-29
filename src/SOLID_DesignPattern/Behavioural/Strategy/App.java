package SOLID_DesignPattern.Behavioural.Strategy;

public class App {
    public static void main(String[] args) {


        Context context = new Context(new AddStrategy());
        System.out.println(context.executeStrategy(10, 5));

        Context context1 = new Context(new SubtractStrategy());
        System.out.println(context1.executeStrategy(10, 20));

        Context context2 = new Context(new MultiplicationStrategy());
        System.out.println(context2.executeStrategy(10, 5));

        Context context3 = new Context(new DivisionStrategy());
        System.out.println(context3.executeStrategy(10, 5));
    }
}
