package Oct.ex023102024_exception;

public class Lab177 {

    public static void main(String[] args) {

        try {
            String ip = args [0];

            int a = Integer.parseInt(ip);

            int b = 100/a;
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e) {

        System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());

            throw new RuntimeException(e);
        } finally {
            System.out.println("end");


        }


    }
}
