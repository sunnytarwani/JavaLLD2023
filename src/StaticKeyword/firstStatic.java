package StaticKeyword;

class Phone{
    int value;
    String phoneType;
    static String phoneName;

    static {
        phoneName = "OPPO";
        System.out.println("Inside static block");
    }
    Phone(){
        value = 200;
        phoneType = "SmartPhone";
        System.out.println("Inside constructor block");
    }

    public void showValues(){

        System.out.println(phoneType + " " + value + " " + phoneName);
    }

    public static void printValues(){
        System.out.println(/*phoneType + " " + value*/  phoneName);
        //we can't call the nonstatic variables inside a static method.
    }

    public static void displayValues(Phone obj){
        System.out.println(obj.phoneType + " " + obj.value + " " + phoneName);
    }
}

public class firstStatic {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.value = 300;
        //Phone.phoneName = "Samsung";
        obj1.showValues();

        Phone obj2 = new Phone();
        obj2.value = 250;
        Phone.phoneName = "Iphone";
        Phone.displayValues(obj2);
        System.out.println("-------------------------");
        Phone.displayValues(obj1);

        Phone obj3 = new Phone();
        Phone.phoneName = "Samsung";
        Phone.displayValues(obj3);
    }
}

