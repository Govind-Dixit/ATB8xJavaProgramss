package Oct.ex14102024_abstraction;

public class Lab149 {

}

interface I3 {

    default void start (){
        System.out.println("Body! dm");
    }
    void stop();
    Void car();

    static void ss (){
        System.out.println("static can also have body in interface");
    }

    abstract class AA{

        void f1 (){
            System.out.println("concreate method");
        }

        abstract void f2();
        }

        static void f4 (){
            System.out.println("static word possible in abstract class ");
        }


    }


