package Oct.ex18102024;

public class Lab161_stringFunction {

    public static void main(String[] args) {

        String str = " Hello World ";
        // length of the string-- the length count also count the space also.
        System.out.println("length: " +str.length());

        // Substring
        System.out.println("substring: "+ str.substring(0,2));
        // trim
        System.out.println("trimmed: "+ str.trim() + "'"); // // Outputs: "'Hello World'"

        // Convert to upper case

        System.out.println("uppercase: "+ str. toUpperCase());//output  HELLO WORLD
        System.out.println("lowecase: "+ str.toLowerCase()); // output hello world

        System.out.println(str.charAt(2));

        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

//        String name = " P r a m o d D u t t A";  not use frequently
//        String name2 = "PramoD";
//        System.out.println(name.compareTo(name2));
//        // CompareTo -> 0 - both of them are same
//        // Return Number -> ASCII value diff - between the Strings
//        // d -> D - lexicographically comparasion
//
//        System.out.println(name.strip()


    }
}
