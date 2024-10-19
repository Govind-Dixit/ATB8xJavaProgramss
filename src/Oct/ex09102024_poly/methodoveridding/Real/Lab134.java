package Oct.ex09102024_poly.methodoveridding.Real;

public class Lab134 {
    public static void main(String[] args) {

        Pramod p1 = new Pramod ();

        p1.home();

        father f = new father ();
        f.home();

       //  // Dynamic Dispatch
        father object = new Pramod ();
        object.home();

        // webDriver object = new chromeDriver ();





    }


}
