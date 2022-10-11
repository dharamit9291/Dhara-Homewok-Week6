package week6hwdhara;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods*/
import java.util.Scanner;
public class Calculator5 {
    static double x, y;
    public static void main(String[] args) {
        Calculator5 cal5 = new Calculator5();
        addition();
        cal5.substraction();
        cal5.multiplication();
        division();
    }
    public static void addition() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of x :");
        x = scan.nextDouble();
        System.out.println("Enter value of y :");
        y = scan.nextDouble();
        System.out.println("Addition of x and y = " + (x + y));
        scan.close();
    }
    public void substraction() {
        System.out.println("Subtraction of x and y = " + (x - y));
    }
    public void multiplication() {
        System.out.println("Multiplication of x and y = " + (x * y));
    }
    public static void division() {
        System.out.println("Division of x and y = " + (x / y));
    }
}
