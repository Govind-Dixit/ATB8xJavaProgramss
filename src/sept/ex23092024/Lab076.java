package sept.ex23092024;

public class Lab076 {
    public static void main(String[] args) {

        // switch condition
        // Days 1 to 7 --> 1 MOn, 2 tue, 3wed, 7 sun

        int day =1;
        switch (day){
            case 1:
                System.out.println("mon");
                ;
            case 2:
                System.out.println("tue");

            case 3:
                System.out.println("wed");

            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("no idea, what day it is ");
                break;

        }

        System.out.println("end of the loop");
    }

    }

