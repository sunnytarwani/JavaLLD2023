package SOLID_DesignPattern.StructuralDP.Adapter;

public class XMLtoJSONsoftware implements JSONdata{
    XMLdata xmLdata;

    public XMLtoJSONsoftware(XMLdata xmLdata) {
        this.xmLdata = xmLdata;
    }

    @Override
    public void readJSONdata(){
        xmLdata.readXMLdata();
        System.out.println("Convert the data from XML to JSON");
    }
}
