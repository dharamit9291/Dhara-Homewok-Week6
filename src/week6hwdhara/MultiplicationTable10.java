package week6hwdhara;
/* Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data: Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/
import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        MultiplicationTable10 obj = new MultiplicationTable10();
        obj.multiplication();
    }
    public void multiplication(){
        Scanner scan = new Scanner(System.in);
        int a ;
        System.out.println("Enter any numeric number :");
        a=scan.nextInt();
        scan.close();
        System.out.println(  a + " X 1   = " + (a*1));
        System.out.println(  a + " X 2   = " + (a*2));
        System.out.println(  a + " X 3   = " + (a*3));
        System.out.println(  a + " X 4   = " + (a*4));
        System.out.println(  a + " X 5   = " + (a*5));
        System.out.println(  a + " X 6   = " + (a*6));
        System.out.println(  a + " X 7   = " + (a*7));
        System.out.println(  a + " X 8   = " + (a*8));
        System.out.println(  a + " X 9   = " + (a*9));
        System.out.println(  a + " X 10  = " + (a*10));
    }
}
