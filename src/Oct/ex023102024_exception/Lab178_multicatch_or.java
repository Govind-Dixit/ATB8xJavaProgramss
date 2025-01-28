package Oct.ex023102024_exception;

public class Lab178_multicatch_or {

    public static void main(String[] args) {
        int b = 0; // ArithmeticException
        try {

            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        }




    }
}
