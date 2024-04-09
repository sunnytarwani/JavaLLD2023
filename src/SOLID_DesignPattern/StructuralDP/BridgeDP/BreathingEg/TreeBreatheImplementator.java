package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class TreeBreatheImplementator implements BreathImplementator{

    @Override
    public void breathe() {
        //Breathe through Leaves
        //Inhale Carbon Dioxide
        //Exhale Oxygen
        System.out.println("Breathing process by Trees");
    }
}
