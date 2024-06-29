package SOLID_DesignPattern.CreationalDP.PrototyeDP;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }


    public void loadImportantData() throws InterruptedException {
        this.importantData = "Very very important data";
        Thread.sleep(2000);
        System.out.println("It takes 5 mins of time to make");
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //this is the main logic to get deep copy implemented
        NetworkConnection nc = new NetworkConnection();
        nc.setIp(this.getIp());
        nc.setImportantData(this.getImportantData());

        for(String d : this.getDomains()){
            nc.getDomains().add(d);
        }

        return nc;
        //this ends the deep copy method
//        return super.clone();
    }
}
