package ThisandSuper;


class Animal{
    Animal(){
        System.out.println("you're in Animal Constructor");
    }
    Animal(String alpha){
        System.out.println("you're in Animal Constructor and name is : " + alpha);
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("you're in Dog Constructor");
    }
    Dog(String alpha){
        super(alpha);
        //this();
        System.out.println("you're in Dog Constructor and name is : " + alpha);
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Dog d = new Dog("Lion");
        Animal ani = new Dog();

        Animal ani2 = new Animal();
    }
}
