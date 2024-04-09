package Final;


import Inheritance.Cal;

class Car{
    final int rate = 500000;
    public final void show(){
        System.out.println("Created by Sunny");
    }

    public int addTax(int a){
        return rate*a;
    }

}

final class Car1{
    final int rate = 500000;
    public final void show(){
        System.out.println("Created by Sunny");
    }

    public int addTax(int a){
        return rate*a;
    }
}

class Maruti extends Car {

    //As we see that show method is final, we're getting error while using it.


    @Override
    public int addTax(int a) {
        return super.addTax(a);
    }
}


/*
* As you can see that the extends is not allowed
* we have used final before the class
* this will stop inheritance.
* */
//class Honda extends Car1{
//
//}


public class Demo {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        int alpha = c.addTax(5);
        System.out.println(alpha);
        System.out.println(c.rate);
    }
}
