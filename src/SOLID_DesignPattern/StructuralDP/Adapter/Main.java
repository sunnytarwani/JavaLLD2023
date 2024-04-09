package SOLID_DesignPattern.StructuralDP.Adapter;

public class Main {
    public static void main(String[] args) {

        XMLdata xmLdata = new XMLsoftware();
        JSONdata jsoNdata = new XMLtoJSONsoftware(xmLdata);

        jsoNdata.readJSONdata();
    }
}
