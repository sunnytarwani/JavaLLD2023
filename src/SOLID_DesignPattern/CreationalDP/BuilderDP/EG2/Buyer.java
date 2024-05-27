package SOLID_DesignPattern.CreationalDP.BuilderDP.EG2;

public class Buyer {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setCarVariant("Petrol")
                .setCheckAutomatic(true)
                .setModelName("Hatchback")
                .build();

        System.out.println(car);
    }
}
