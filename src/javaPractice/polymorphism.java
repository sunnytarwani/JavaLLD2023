package javaPractice;

interface myCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }

    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4K......");
    }
}

interface myWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void cellNumber(int phoneNumber){
        System.out.println();
    }
}

public class polymorphism {
    public static void main(String[] args) {

    }
}
