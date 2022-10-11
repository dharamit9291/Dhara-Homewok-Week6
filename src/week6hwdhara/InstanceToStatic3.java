package week6hwdhara;

/* 3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme*/
public class InstanceToStatic3 {
    int a = 10;
    static String name = "Alpha";

    public static void main(String[] args) {
        InstanceToStatic3 obj = new InstanceToStatic3();
        obj.myInsToIns();
        myStactoStac();
    }

    //instance method
    public void myInsToIns() {
        System.out.println(a);
    }

    //static method
    public static void myStactoStac() {
        System.out.println(InstanceToStatic3.name);
    }
}
