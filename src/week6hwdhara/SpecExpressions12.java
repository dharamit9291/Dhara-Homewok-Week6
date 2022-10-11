package week6hwdhara;
/*. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889*/

public class SpecExpressions12 {
    public void expressions(){
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    public static void main(String[] args) {
       SpecExpressions12 se = new SpecExpressions12();
       se.expressions();
    }
}
