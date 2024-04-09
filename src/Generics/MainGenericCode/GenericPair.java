package Generics.MainGenericCode;



    public class GenericPair<FIRST , SECOND> {
    private FIRST first;
    private SECOND second;

    public GenericPair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getfirst() {
        return first;
    }

    public SECOND getsecond() {
        return second;
    }

        /**
         * data of any primitive type we can pass inside the constructor
         * so we can't define all the constructor with different primitive tyep, thats why we use generics
         */

//    public static void main(String[] args) {
//        GenericPair genericPair = new GenericPair(5.6f , "SUNNY");
//    }
}
