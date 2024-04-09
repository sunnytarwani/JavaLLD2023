package AbstractPackage;

abstract class Car{
    public abstract int Mileage();

    public  void show(){
        System.out.println("The Car class is the parent abstract class");
    }
}

class Maruti extends Car{

    @Override
    public int Mileage() {
        return 5000;
    }
}

class Suzuki extends Car{

    @Override
    public int Mileage() {
        return 3900;
    }
}



public class first {
    public static void main(String[] args) {
        Car c = new Maruti();
        int r=c.Mileage();
        System.out.println(r);
        c.show();

        Car c1 = new Suzuki();
        int r1 = c1.Mileage();
        System.out.println(r1);

    }
}
