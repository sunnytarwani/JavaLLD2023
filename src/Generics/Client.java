package Generics;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair("Sunny" , 1);
        Pair p2 = new Pair("Hi" , "hello");


        /**
         * We're type casting it because as we can see the return value will be Object
         * so it will be like asking for Dog class but we're getting Animal
         */
        int b = (int) p1.getSecond() + 10;
        System.out.println(b);

        /**
         * Another way is the Directly it will get type casted by sout
         */
        Object a = p1.getFirst();
        System.out.println(a);
    }
}
