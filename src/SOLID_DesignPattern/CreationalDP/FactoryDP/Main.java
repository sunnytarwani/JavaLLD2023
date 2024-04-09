package SOLID_DesignPattern.CreationalDP.FactoryDP;

public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getDetails("Android Developer");
        System.out.println("Salary : " + employee.salary());
    }
}
