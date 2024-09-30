package sept.ex18092024;

public class Lab050 {
    public static void main(String[] args) {
        // Type casting
        // Widening - Imlicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with datatype loss    )

        // Widening
        byte b = 10;
        int a = b;// valid - imlicit casting - by jvm
        int a1 =(int)b;// Valid - explicit  casting - JVM

        // Narrowing
        int val = 300;
        //byte b1 = val;//invalid implicit casting - JVM
        byte b2 = (byte)val;// invalid explicit casting - loss of data





    }
}
