package SOLID_DesignPattern.Behavioural.Strategy;

public class MultiplicationStrategy implements Strategy{
    @Override
    public int doCalculate(int a, int b) {
        return a*b;
    }
}
