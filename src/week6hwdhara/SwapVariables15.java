package week6hwdhara;
/* Write a Java program to swap two variables*/
import java.util.Scanner;
public class SwapVariables15 {
    static int x, y, z;
    public static void variables() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value x and y");
        x = scan.nextInt();
        y = scan.nextInt();
        z = x;
        x = y;
        y = z;
        System.out.println("After swapping numbers = "+ x + " and "+ y);
        scan.close();
    }
    public static void main(String[] args) {
        variables();
    }
}
