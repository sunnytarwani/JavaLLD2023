package Interface;
interface A{
    int age = 25;
    String city = "Mumbai";
    void run();
    void display();
}

interface B {
    void interfaceDetails();
}

//interface extends another interface
interface C extends B{

}

//class to create and implement the interface
class X implements A ,C{

    @Override
    public void run() {
        System.out.println("Running inside the class X");
    }

    @Override
    public void display() {
        System.out.println("Displaying the details after implementing interface");
    }

    @Override
    public void interfaceDetails() {
        System.out.println("from interface C");
    }
}



public class first {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(A.age);
        //A.city = "Bandra";
        //As you can notice that the variables are final and static, can't make any changes.

        x.interfaceDetails();
        x.display();
        x.run();
    }
}
