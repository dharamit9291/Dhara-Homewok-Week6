package week6hwdhara;
//Write a program to calculate the area of a triangle
import java.util.Scanner;
public class Triangle8 {
    double base,height;
    public static void main (String [] args){
    triangle();
    }
    public static void triangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of base:");
        Triangle8 trg = new Triangle8();
        trg.base = scan.nextDouble();
        System.out.println("Enter value of height:");
        trg.height = scan.nextDouble();
        scan.close();
        System.out.println("Area of Triangle is :" + ((trg.base* trg.height)/2));
    }
}
