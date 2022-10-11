package week6hwdhara;
/*Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/
import java.util.Scanner;

public class Temperature7 {
    static double F;

    public static void main(String[] args) {
    temperature();
    }
    public static void temperature(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of F :");
        F = scan.nextDouble();
        scan.close();
        System.out.println("Celcius C = "+ ((F - 32) * 5.0/9.0));
    }
}
