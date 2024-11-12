package Oct.ex18102024;

import java.sql.SQLOutput;

public class Lab160_String_EqualsCheck {

    public static void main(String[] args) {
        String s1 = " Hello";
        String s2 = new String ("Hello");
        String s3 = new String ("Hello");
        String s4 = "Hello";
        String s5 = new String ("hello");

//        System.out.println(s1 == s2);// check the location of the string.
//        System.out.println(s2 == s3);//
//        System.out.println(s1 == s4);

        // How can I check the value of string = to using by equals
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));// this one use to ignore the upper case // lower case




    }

}
