package SOLID_DesignPattern.CreationalDP.FactoryDP;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("A android developer object is created");
        return 125000;
    }
}
