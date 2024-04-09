package SOLID_DesignPattern.CreationalDP.FactoryDP;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("A Web developer object is created");
        return 100000;
    }
}
