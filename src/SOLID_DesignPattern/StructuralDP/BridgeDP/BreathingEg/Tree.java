package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class Tree extends LivingThings{

    public Tree(BreathImplementator breathImplementator) {
        super(breathImplementator);
    }

    @Override
    void breathProcess() {
        breathImplementator.breathe();
    }
}
