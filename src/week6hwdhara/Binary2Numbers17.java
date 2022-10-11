package week6hwdhara;
/*Write a Java program to convert a decimal number to binary number.
        Input Data:
        Input a Decimal Number : 5
        Expected Output
        Binary number is: 101*/

import java.util.Scanner;

public class Binary2Numbers17 {
    public static void Binary2() {
        //String S1 = "5";
        // int binary = Integer.parseInt(S1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Decimal number: ");
        int S1 =scan.nextInt();
        String bin = Integer.toBinaryString(S1);
        System.out.println("Binary number: " + bin);
        scan.close();
    }

    public static void main(String[] args) {
        Binary2();
    }


}


