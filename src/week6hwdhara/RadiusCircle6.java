package week6hwdhara;
/* Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)*/
import java.util.Scanner;

public class RadiusCircle6 {
static double r;
static double PI = 3.1416;
    public static void main(String[] args) {
    formula();
    }
    public static void formula(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of r :");
        r = scan.nextDouble();
        scan.close();
        System.out.println("Area A = "+ (3.1416*r*r));
    }
}
