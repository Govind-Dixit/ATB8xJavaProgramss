package task;

import java.util.Scanner;

public class task_20sep_Triangle_Classifier {

    public static void main(String[] args) {


        // Triangle Classifier
        // // Write a program that classifies a triangle based on its side lengths.
        //
        //// Given three input values representing the lengths of the sides, determine
        //
        //// if the triangle is equilateral (all sides are equal),
        //
        //// isosceles (exactly two sides are equal), or
        //
        //// scalene (no sides are equal).
        //
        //// Use an if-else statement to classify the triangle.
        //
        //// side1, side2, side3 ->

        // step 1-> input - slide -data type- double as interview told
        // step 2--> out put--string

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of side 2");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of side 3");
        double side3 = sc.nextDouble();
        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("equal");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("iso");

            } else {
                System.out.println("scalene");


            }
            }else {
            System.out.println( " are you made");
        }

    }
}

// Always talkt o your interviews and give them extra
// . Edge you need to give them and if you can handle them
// Test Validation ->  special