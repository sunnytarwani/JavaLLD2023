package AbstractPackage;


abstract class Computer{
    public abstract void show() ;
}

class Laptop extends Computer{

    @Override
    public void show() {
        System.out.println("This is a abstract method of laptop");
    }
}

class Desktop extends Computer{

    @Override
    public void show() {
        System.out.println("This is a abstract method of Desktop");
    }
}

class Developer{
        public void Display(Computer c){
        c.show();
    }
}

public class Second {
    public static void main(String[] args) {
        Computer c = new Laptop();
        Computer c1 = new Desktop();

        Developer d = new Developer();
        d.Display(c);

        Developer d1 = new Developer();
        d1.Display(c1);
    }
}
