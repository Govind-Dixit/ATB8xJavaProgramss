package Oct.ex11102024_ECapssulation.superkeyword;

public class lab139 {

    //  Super keyword in java is a reference variable that allows
    //  a sub class (child class to reference the parrent class.)

    //1. use of super with variable
    // 2.use of super with methods
    // 3.use of super with constructors

}



class car extends vehicle{
     private int maxspeed = 281;

     void display () {

         System.out.println("child");
     }


     car () {
      super(10);
         System.out.println("DC Car");
         System.out.println(this.maxspeed);
         System.out.println(super.maxspeed);
         this.display();// my own

          //paremt display
         System.out.println(super.maxspeed);

     }




}

class vehicle {

    public int maxspeed = 180;

    vehicle (){

        System.out.println("DC Vehicle");
    }
    vehicle (int a ) {
        System.out.println("PC vehicle");
    }

    void message (){
        System.out.println("Hello Vehicle");

    }

    void message (int a ){
        System.out.println("Hello vehicle");
    }


}




