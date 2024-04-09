package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class Main {
    public static void main(String[] args) {
        LivingThings livingThings = new Dog(new LandBreatheImplementator());
        livingThings.breathProcess();
    }
}
