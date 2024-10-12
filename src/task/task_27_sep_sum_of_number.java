package task;

import org.w3c.dom.ls.LSOutput;

public class task_27_sep_sum_of_number {

    public static void main(String[] args) {

        // calculate the sum of number from 1 to 100

//        int sum = 0;
//
//        int i = 1;
//
//        while (i <= 100) {
//            sum = sum + i;
//            i++;
//            System.out.println(sum);


        int sum = 0; // Variable to hold the sum
        int i = 1; // Starting point

        do {
            sum += i; // Add i to sum
            i++; // Increment i
        } while (i <= 100); // Continue until i is greater than 100

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
