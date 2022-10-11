package week6hwdhara;
/*. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers*/
import java.util.Scanner;

public class AvaNumbers13 {
    public static void Numbers(){
        int a;
        int b;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of first number :");
        a = scan.nextInt();
        System.out.println("Enter value of second number :");
        b = scan.nextInt();
        System.out.println("Enter value of third number :");
        c = scan.nextInt();
        System.out.println("Average of numbers = " + (a+b+c)/3);
        scan.close();
    }
    public static void main(String[] args) {
    Numbers();
    }
}
