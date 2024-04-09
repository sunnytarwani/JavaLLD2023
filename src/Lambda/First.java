package Lambda;

import java.sql.SQLOutput;

@FunctionalInterface
interface A{
    void show(int i);
}

public class First {
    public static void main(String[] args) {
//        A a = new A() {
//            @Override
//            public void show() {
//                System.out.println("in the show method");
//            }
//        };
//
//        a.show();

        //Now to cut short the above code, we will use Lambda Function
        //the code will be same, it will cut the obvious thing as java has become intelligent

        A a = (i) ->
        {
            System.out.println("In the show method" + " " + i);
        };

        a.show(5);

        //the java is so smart you need not enter the type of the variable that is
        //if there is only one variable, it will take the type automatically

    }
}
