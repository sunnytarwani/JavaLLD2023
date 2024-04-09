package ExceptionHandling;

class SunnyException extends Exception{
    public SunnyException(String s){

    }
}


public class CreateOwnException {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0){
                throw new SunnyException("I don't want to print the messgae");
            }
        }
        catch (SunnyException se){
            j = 18/1;
            System.out.println("that's the default output" + se);
        }
        catch (Exception e){
            System.out.println("Something went wrong .... " + e);
        }

        System.out.println(j);

    }
}
