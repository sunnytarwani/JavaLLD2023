package ExceptionHandling;

public class Second {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            if(i == 0){
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e){
            j = 18/1;
            System.out.println("thats the default answer to the error");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("We're just trying to check");
        }


        System.out.println(j);
        System.out.println("Thats how we use the throw keyword");
    }
}
