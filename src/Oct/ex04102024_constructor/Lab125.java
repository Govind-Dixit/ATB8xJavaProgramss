package Oct.ex04102024_constructor;

public class Lab125 {

    public static void main(String[] args) {

        Ahuman amit = new Ahuman();
        Ahuman pramod = new Ahuman ("pramod");
        Ahuman vijay = new Ahuman ( "vijay");


        System.out.println(amit.planet);
        System.out.println(pramod.planet);


        System.out.println(amit.name);
        System.out.println(pramod.name);
        System.out.println(vijay.name);

    }
}
