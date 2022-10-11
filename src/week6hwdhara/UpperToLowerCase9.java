package week6hwdhara;
//Write a program to convert the upper case to lower case
import java.util.Scanner;
public class UpperToLowerCase9 {
    public static void main(String[] args) {
UpperToLowerCase9 obj = new UpperToLowerCase9();
obj.UpperCase();
    }

    public void UpperCase() {
        Scanner scan = new Scanner(System.in);
        String s1;
        System.out.println("Enter in upper case :");
        s1=scan.nextLine();
        scan.close();
        System.out.println(s1.toLowerCase());

    }

}