package Oct.ex18102024;

public class Lab162_String_Immutable {

    public static void main(String[] args) {

        String str = "Hello";
        String str3 = "Hello";
        String str2 = str.concat(" world");
        System.out.println(str); // output Hello
        System.out.println(str3); // output Hello
        System.out.println(str2); // output Hello world

    }
}
