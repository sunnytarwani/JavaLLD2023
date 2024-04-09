package SOLID_DesignPattern.CreationalDP.PrototyeDP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design pattern");

        NetworkConnection nc = new NetworkConnection();
        nc.setIp("192.168.10.245");
        List<String> domains = new ArrayList<>();
        domains.add("www.google.com");
        domains.add("www.jingle.com");
        domains.add("www.facebook.com");
        domains.add("www.insta.com");
        nc.setDomains(domains);
        nc.loadImportantData();
        System.out.println(nc);

        //we want new object of the network connection

        try {
            NetworkConnection nc2 = (NetworkConnection) nc.clone();
            NetworkConnection nc3 = (NetworkConnection) nc.clone();

            nc.getDomains().remove(1);
            System.out.println(nc);
            System.out.println(nc2);
            System.out.println(nc3);
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
