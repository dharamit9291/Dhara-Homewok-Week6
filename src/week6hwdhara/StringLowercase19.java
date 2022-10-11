package week6hwdhara;
/*Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        Output: the quick brown fox jumps over the lazy dog*/

import java.util.Scanner;

public class StringLowercase19 {
    public void Lowercase(){
        Scanner scan = new Scanner(System.in);
        String S1;
        System.out.println("Input Uppercase : ");
        S1 = scan.nextLine();
        System.out.println(S1.toLowerCase());
        scan.close();
    }
    public static void main(String[] args) {
        StringLowercase19 obj = new StringLowercase19();
        obj.Lowercase();
    }
}
