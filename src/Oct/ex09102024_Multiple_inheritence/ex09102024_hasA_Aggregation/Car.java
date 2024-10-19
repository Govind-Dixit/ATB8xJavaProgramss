package Oct.ex09102024_Multiple_inheritence.ex09102024_hasA_Aggregation;

public class Car {

    // Car has a engine and tyre

    protected void startcar(){

        System.out.println("starting car");

        new Engine().start();
        new Tyre ().rolling ();
    }
}
