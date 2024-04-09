package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class Dog extends LivingThings{


    public Dog(BreathImplementator breathImplementator) {
        super(breathImplementator);
    }

    @Override
    void breathProcess() {
        breathImplementator.breathe();
    }
}
