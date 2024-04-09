package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class LandBreatheImplementator implements BreathImplementator{
    @Override
    public void breathe() {
        //Breathe through NOSE
        //Inhale oxygen
        //Exhale Carbon Dioxide
        System.out.println("Breathing process by land animals");
    }
}
