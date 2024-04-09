package SOLID_DesignPattern.CreationalDP.Singleton.LazyWay;

public class DBMS {

    private static DBMS dbms;
    private DBMS(){

    }

    public static DBMS getDBMS(){
        if(dbms == null){
            dbms = new DBMS();
        }

        return dbms;
    }
}
