package Inheritance;

public class AdvCalc extends Cal {

    public int Mul(int a , int b){
        return a*b;
    }

    public int Div(int a , int b){
        return a/b;
    }

    @Override
    public int total() {
        return super.total();
    }
}
