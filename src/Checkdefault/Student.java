package Checkdefault;

public class Student {
    private String name;
    int age;
    int batchId;
    protected double psp;
    public String universityName;

    void changeBatch(int newbatchID){
        this.batchId = newbatchID;
    }


//    void giveMochInterview(){
//        System.out.println("Giving Mock Interview");
//    }
}
