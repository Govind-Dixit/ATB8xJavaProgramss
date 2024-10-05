package sept.ex23092024;

public class Lab075 {
    public static void main(String[] args) {

        // switch condition
        // Days 1 to 7 --> 1 MOn, 2 tue, 3wed, 7 sun

        int day =7;
        switch (day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
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
