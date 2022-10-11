package week6hwdhara;

/*1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/

public class InstanceToInstance1 {
    int d = 5;
    int b = 10;

    public static void main(String[] args) {
        InstanceToInstance1 obj = new InstanceToInstance1();
        obj.myFirstStatic();
    }
    // Instance variable
    public void myFirstStatic() {
        System.out.print(" d = ");
        System.out.println(d);
        System.out.print(" b = ");
        System.out.println(b);
    }
}
