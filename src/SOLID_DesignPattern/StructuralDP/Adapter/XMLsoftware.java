package SOLID_DesignPattern.StructuralDP.Adapter;

public class XMLsoftware implements XMLdata{
    @Override
    public void readXMLdata() {
        System.out.println("data is in the XML format");
    }
}
