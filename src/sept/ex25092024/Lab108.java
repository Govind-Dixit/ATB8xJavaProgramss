package sept.ex25092024;

public class Lab108 {
    public static void main(String[] args) {
        //print the all value of even and odd number from 0 to 50

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("even" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}