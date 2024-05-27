package Generics.MainGenericCode;

public class Client {
    public static void main(String[] args) {
        GenericPair<Integer , Integer> pair1 = new GenericPair<>(10 , 15);
        GenericPair<String , Float> pair2 = new GenericPair<>("Sunny" , 3.14f);
        GenericPair<Double , Double> pair3 = new GenericPair<>(2.334d , 5.436d);

        System.out.println(pair1.getfirst());
        System.out.println(pair1.getsecond());
        System.out.println();

        System.out.println(pair2.getfirst());
        System.out.println(pair2.getsecond());
        System.out.println();

        System.out.println(pair3.getfirst());
        System.out.println(pair3.getsecond());
        System.out.println();

    }
}
