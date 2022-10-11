package week6hwdhara;
 /*Write a Java program to print the sum (addition), multiply, subtract, divide and
         remainder of two numbers.
         Test Data:
         Input first number: 125
         Input second number: 24
         Expected Output :
         125 + 24 = 149
         125 - 24 = 101
         125 x 24 = 3000
         125 / 24 = 5
         125 mod 24 = 5*/

import java.util.Scanner;


public class JavaCalc18 {
    public static void Calc (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number : ");
        int f1 = scan.nextInt();
        System.out.println("Input second number : ");
        int f2 = scan.nextInt();
        scan.close();

        System.out.println(f1 + "+"+ f2 + "="+(f1+f2));
        System.out.println(f1 + "-"+ f2 + "-"+(f1-f2));
        System.out.println(f1 + "x"+ f2 + "="+(f1*f2));
        System.out.println(f1 + "/"+ f2 + "="+(f1/f2));
        System.out.println(f1 + "mod"+f2 + "="+(f1%f2));
    }

    public static void main(String[] args) {
        Calc();
    }

}
