package Oct.ex21102024_wrapper_Exception;

public class Lab167 {

    public static void main(String[] args) {


        //Primitive to wraperclass

        int a = 10;

        Integer b = a;// Boxing of int > Interger

        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        Integer a2 = 42;

        int value = a2;// unboxing - Integer -> int
        System.out.println(value);


    }
}
