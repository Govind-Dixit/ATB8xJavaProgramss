package Oct.ex21102024_wrapper_Exception;

public class Lab173_Exception {
    public static void main(String[] args) {

        // Unchecked - java.lang.NullPointerException
        // jvm - at the Runtime -> Terminated the program.

        System.out.println("start");
        String s1 = null;

        System.out.println(s1.trim());//// Lab173_Exception.java:10

        System.out.println("End");
    }
}
