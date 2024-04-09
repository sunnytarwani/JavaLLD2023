package SOLID_DesignPattern.StructuralDP.BridgeDP.BreathingEg;

public class WaterBreatheImplementator implements BreathImplementator{

    @Override
    public void breathe() {
        //Breathe through GILLS
        //Absorb Oxygen from Water
        //Release Carbon Dioxide
        System.out.println("Breathing process by water animals");
    }
}
