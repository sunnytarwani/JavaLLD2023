package SOLID_DesignPattern.StructuralDP.Adapter;

public class JSONsoftware implements JSONdata{
    @Override
    public void readJSONdata() {
        System.out.println("data is in the JSON format");
    }
}
