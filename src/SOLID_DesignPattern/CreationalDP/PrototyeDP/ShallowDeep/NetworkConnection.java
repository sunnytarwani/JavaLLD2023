package SOLID_DesignPattern.CreationalDP.PrototyeDP.ShallowDeep;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;
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
                "ip='" + this.getIp() + '\'' +
                ", importantData='" + this.getImportantData() + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
