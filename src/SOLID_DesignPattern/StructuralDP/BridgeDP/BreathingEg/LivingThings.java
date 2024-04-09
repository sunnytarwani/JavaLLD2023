package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public abstract class LivingThings {

    BreathImplementator breathImplementator;

    public LivingThings(BreathImplementator breathImplementator) {
        this.breathImplementator = breathImplementator;
    }

    abstract void breathProcess();
}
