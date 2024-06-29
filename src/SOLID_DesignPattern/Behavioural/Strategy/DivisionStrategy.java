package SOLID_DesignPattern.Behavioural.Strategy;

public class DivisionStrategy implements Strategy{
    @Override
    public int doCalculate(int a, int b) {
        if(a>=b){
            return a/b;
        }
        return b/a;
    }
}
