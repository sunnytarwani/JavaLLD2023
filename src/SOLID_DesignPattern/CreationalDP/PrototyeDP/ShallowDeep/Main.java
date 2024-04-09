package SOLID_DesignPattern.CreationalDP.PrototyeDP.ShallowDeep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design pattern");

        NetworkConnection nc = new NetworkConnection();
        nc.setIp("192.168.10.245");
        nc.loadImportantData();
        System.out.println(nc);

        //we want new object of the network connection
        NetworkConnection nc2 = null;
        try {
            nc2 = (NetworkConnection) nc.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(nc2);

    }
}
