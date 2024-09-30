package sept.ex18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // Narrowing implicit - jvm // invalid
        short s1 = (short)phone_no;// narrowing explicit -loss data


    }

}
