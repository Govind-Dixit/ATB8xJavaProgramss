package sept.ex25092024;

import java.util.Scanner;

public class Lab114 {

    public static void main(String[] args) {

        // How to take the user input

        Scanner sc = new Scanner(System.in);//new object
        System.out.println("enter the number");
        int num= sc.nextInt();
        System.out.println(num);

        String name = sc.next();
        System.out.println("Enter the String");

       // String name = sc.nextLine();
        System.out.println(name);

    }
}
