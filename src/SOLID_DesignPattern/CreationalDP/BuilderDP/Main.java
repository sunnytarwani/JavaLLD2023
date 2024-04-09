package SOLID_DesignPattern.CreationalDP.BuilderDP;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setUserCity("Mumbai").setUserId(1900).setUserName("Sunny").build();
        System.out.println(user);
    }
}
