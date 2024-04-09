package SOLID_DesignPattern.CreationalDP.FactoryDP;

public class EmployeeFactory {

    public static Employee getDetails(String alpha){
        if(alpha.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else  if(alpha.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
