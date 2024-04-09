package SOLID_DesignPattern.CreationalDP.Singleton.ThreadSafeEagerWay;

public class BURGER {

    private static BURGER burger;
    private BURGER(){

    }

    public static BURGER getBURGER(){
        if(burger == null){
            synchronized (BURGER.class) {
                if (burger == null) {
                    burger = new BURGER();
                }
            }
        }
        return burger;
    }
}
/**
 *
 */