package ExceptionHandling;

public class First {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 180/i;
        }
        catch (Exception e){
            System.out.println("something is wrong...." + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
