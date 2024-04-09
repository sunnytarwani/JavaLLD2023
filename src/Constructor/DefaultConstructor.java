package Constructor;


class Phones{
    private int value;
    private String PhonesName;

    public int getValue(){
        return this.value;
    }
    public String getPhonesName(){
        return  this.PhonesName;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setPhonesName(String PhonesName){
        this.PhonesName = PhonesName;
    }

    public void getDetails(){
        System.out.println(getPhonesName() +" : " + getValue());
    }
}


public class DefaultConstructor {
    public static void main(String[] args) {
        Phones p = new Phones();
        p.setValue(10);
        p.setPhonesName("Samsung");
        p.getDetails();
    }
}
