package Oct.ex21102024_wrapper_Exception;

public class Lab170_exception_handling {
    public static void main(String[] args) {

        System.out.println("start the porgrame");
        String ip = args[0];// 10 Value stored here form cli//ArrayIndexOutOfBoundsException
        int a  = Integer.parseInt(ip);//// 10 // NumberFormatException
        int b = 1000/a;//// 0 ArithmeticException -> / by zero
        System.out.println(b);//100 will be print
        System.out.println("end the programme");

        //JVM will be Initialized (From RAM)
        //Creates and Starts the main Thread. - Main Called
        //1) Collects the Command Line Arguments - 10
        // String[] args = {10} ->
        // 2) Lab170_Exception.main()
        //Now Control will be transferred from main Thread to main method

        // When problem comes in main -> JVM
        // If you don't handle the exception JVM will handle it
        // Always terminate the program




    }
}
