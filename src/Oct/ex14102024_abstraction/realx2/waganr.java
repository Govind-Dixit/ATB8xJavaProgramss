package Oct.ex14102024_abstraction.realx2;

public class waganr extends engine {

    void drive (){
        startingengine();
        stoptengine();

    }

    @Override
    void startingengine() {
        System.out.println("start the car");

    }

    @Override
    void stoptengine() {
        System.out.println("stop the car");

    }
}
