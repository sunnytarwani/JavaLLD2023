package SOLID_DesignPattern.Behavioural.Strategy;

public class SubtractStrategy implements Strategy{
    @Override
    public int doCalculate(int a, int b) {
        return Math.abs(a-b);
    }
}
