package Oct.ex04102024_constructor;

public class Ahuman {

    String planet = "Ahuman";
    String name;
    long aadhar_card_number;

    // Defualt constructor

    Ahuman (){
        System.out.println("I will be called , when objecte created");
        // write a code here which is automatically run when object is created
        // Read a file txt
        // Read  a CSV, Excel here
    }
 // parameterized Constructors
    Ahuman (String name) {
        System.out.println(" I am parm constractor");
        this.name = name;

    }

    void walk () {

    }

    int talk (){
        System.out.println("RTNA");
        return 10;

    }

    String sleep (String name){
        System.out.println("sleeping");
        System.out.println("RTWA");
        return "Iam sleeping ";

    }

    void eat (String name){
        System.out.println("eating");

        System.out.println("NRWA");
    }
}
