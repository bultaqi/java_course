package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        // Step 1: get the number of hours worked
        System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Step 2: get the hourly pay rate
        System.out.println("Enter the employee's pay rate:");
        double rate = scanner.nextDouble();

        // after the last inputs from the scanner, it must be closed
        scanner.close();

        // Step 3: multiply hours and pay rate
        double pay = hours * rate;

        // Step 4: display result
        System.out.println("The employee's gross pay is: $ " + pay);

    }

}
