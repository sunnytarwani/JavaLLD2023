package SOLID_DesignPattern.CreationalDP.Singleton.EagerWay;

public class DBMS {

     public static DBMS dbms = new DBMS();
    private DBMS(){

    }

    public static DBMS getDBMS(){
        return dbms;
    }
}
