package sept.ex23092024;

public class Lab084 {
    public static void main(String[] args) {

        int itemcode =001;

        switch (itemcode){

            case 001 -> System.out.println("it is a laptop");
            case 002 -> System.out.println("it is a desktop");
            case 003, 004 -> System.out.println(" it is a mobile");
            default -> System.out.println("none");
        }

    }
}
