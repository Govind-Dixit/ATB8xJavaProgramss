package Oct.ex14102024_abstraction;

public class Lab148 {

    public static void main(String[] args) {
        ABC  abc = new ABC();
        abc.f1();
        abc.f2();

    }
}


class ABC implements I1{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");

    }
}


interface I1{
    void f1 ();
    void f2 ();

}
