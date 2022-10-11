package week6hwdhara;
/*Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme*/
public class StaticToInstance4 {
 int x = 8;
 int y = 16 ;
 static String name = "Rocket";
 static String name1 = "Singh";
    public static void main(String[] args) {
    mystactostac();
    StaticToInstance4 obj = new StaticToInstance4();
    obj.myinstostac();
    }
    //static method
    public static void mystactostac(){
    StaticToInstance4 obj1 = new StaticToInstance4();
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(name);
        System.out.println(name1);
    }
    //instance method
    public void myinstostac(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(StaticToInstance4.name);
        System.out.println(StaticToInstance4.name1);
            }
}
