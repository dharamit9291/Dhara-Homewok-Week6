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
        String x = "10";
        String y = "11";
        System.out.println("first binary number:10 ");
        System.out.println("second binary number:11 ");
        int decimal1=Integer.parseInt(x,2);
        int decimal2=Integer.parseInt(y,2);
        int decimal3 = decimal1+decimal2;
        String binary = Integer.toBinaryString(decimal3);
        System.out.println("Sum of two binary numbers: ");
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Binary();
          }
}
