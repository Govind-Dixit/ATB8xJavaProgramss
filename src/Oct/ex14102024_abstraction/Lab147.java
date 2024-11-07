package Oct.ex14102024_abstraction;

public class Lab147 {
    public static void main(String[] args) {

        p p1 = new p();
        p1.f1();
    }

}

class p implements i{

    @Override
    public void f1() {
        System.out.println("created");
    }
}



interface i{

    void f1 ();
}

