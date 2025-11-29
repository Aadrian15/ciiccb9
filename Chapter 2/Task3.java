public class Task3 {
   public static void main(String[] args) {
      String a = "Wow";
String b = a;         // b1: a == b → true
String c = "Hello";   // c != a → b3 = true
String d = "Wow!";    // matches b + "!" → b2 = true

boolean b1 = a == b;
boolean b2 = d.equals(b + "!");
boolean b3 = !c.equals(a);

if (b1 && b2 && b3) {
    System.out.println("Success!");
}
      
   }
}