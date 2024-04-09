package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class Fish extends LivingThings{


    public Fish(BreathImplementator breathImplementator) {
        super(breathImplementator);
    }

    @Override
    void breathProcess() {
        breathImplementator.breathe();
    }
}
