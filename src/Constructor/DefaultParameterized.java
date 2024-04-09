package Constructor;

class Phone{
    private int value;
    private String phoneName;

    Phone(){
        value = 350;
        phoneName = "Apple12";
    }

    Phone(int value , String phoneName){
        this.value = value;
        this.phoneName = phoneName;
    }
    public int getValue(){
        return this.value;
    }
    public String getPhoneName(){
        return  this.phoneName;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setPhoneName(String phoneName){
        this.phoneName = phoneName;
    }

    public void getDetails(){
        System.out.println(getPhoneName() +" : " + getValue());
    }
}


public class DefaultParameterized {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p1 = new Phone(500 , "Nokia");

        p.getDetails();
        p1.getDetails();
    }
}
