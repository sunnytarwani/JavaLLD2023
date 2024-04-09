package Polymorphism;

class A{
    public void show(){

        System.out.println("inside class A");
    }

    public int sum(int a , int b ){
        return a+b;
    }
    public double sum(double a , double b){
        return a+b;
    }
    public float sum(float a , float b){
        return a+b;
    }

}

class B extends A{
    @Override
    public void show() {
        System.out.println("inside B");
    }
}

class C extends A{
    @Override
    public void show() {
        System.out.println("inside the class C");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a = new B();
        a.show();

        A a1 = new A();
        a1.show();;

        A a2 = new C();
        a2.show();
    }
}
//dynamic method dispatcher
/*
*  don't know which show method will be called until we assign the object to the reference variable.
* */
