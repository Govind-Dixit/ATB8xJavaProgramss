package Oct.ex023102024_exception;

public class Lab176_Execption_handle {

    public static void main(String[] args) {

        int c = 0; // ArithmeticException
        try {
            int a = 0;
            c = 10 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage()); //ArithmeticException
        } finally {
        }
        System.out.println("I will be always executed");

    }
}
