package week6hwdhara;
/*. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/
import java.util.Scanner;
public class BinaryNumbers16 {
    public static void Binary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("first binary number:   ");
        String x=scan.nextLine();
        System.out.println("second binary number:  ");
        String y=scan.nextLine();
        int decimal1=Integer.parseInt(x,2);
        int decimal2=Integer.parseInt(y,2);
        int decimal3 = decimal1+decimal2;
        String binary = Integer.toBinaryString(decimal3);
        System.out.println("Sum of two binary numbers: "+binary);
        scan.close();
        }

    public static void main(String[] args) {
        Binary();
          }
}
