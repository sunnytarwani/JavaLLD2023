package Inheritance;

public class First {
    public static void main(String[] args) {
        AdvCalc adv = new AdvCalc();
        int r1 = adv.Add(2,3);
        int r2 = adv.Sub(4,2);
        int r3 = adv.Mul(5,2);
        int r4 = adv.Div(10,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
