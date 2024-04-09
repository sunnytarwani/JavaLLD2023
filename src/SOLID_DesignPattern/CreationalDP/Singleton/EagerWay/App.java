package SOLID_DesignPattern.CreationalDP.Singleton.EagerWay;

public class App {
    public static void main(String[] args) {

        DBMS dbms = DBMS.getDBMS();
        System.out.println(dbms.hashCode());

        DBMS dbms1 = DBMS.getDBMS();
        System.out.println(dbms1.hashCode());
    }
}
