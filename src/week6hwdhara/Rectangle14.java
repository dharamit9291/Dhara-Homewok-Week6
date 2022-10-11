package week6hwdhara;
/*Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/


public class Rectangle14 {

    public static void main(String[] args) {
    rectangle();
    }
    public static void rectangle(){
        float Width = 5.6f;
        float Height = 8.5f;
        System.out.println("Area is 5.6 * 8.5 = " + (Width*Height));
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + 2*(Width + Height));
    }
}
