package sept.ex18092024;

public class Lab059 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // Part --> A -> ++a, exp 1= 11, a=11
        // Part --> B -> a++, exp 2 = 11, a== 12
        // Part --> C-> a++ ,   exp 3 =12 , a= 13


    }

}
