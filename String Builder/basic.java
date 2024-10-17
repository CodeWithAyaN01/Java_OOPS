// package String Builder;

public class basic {
    public static void main(String[] args) {
        String name = "Ayan Gupta"; //  here both the variables are pointing to same object Ayan Gupta only
        String name2 = "Ayan Gupta"; //  if try to change name then Java creates new object and then variable (name2) pointes to new object
        System.out.println(name2);
        name2 = "Ayan Only";
        System.out.println(name2); //  name 2 creates new object and it pointes to new object
        
        //  CHECKING IF BOTH VARIABLES ARE POINTING TO SAME VARIABLE OR NOT  //

        System.out.println(name == name2); // returs "false" beacuse name2 was changed
        
        // CREATE A NEW OBJECT IN //

        String a = "hello"; //  in this case both a and b are pointing to same "hello" 
        String b = "hello";
        System.out.println(a == b); // true
        String c = new String("hello"); //  this creates new object of  hello so object of a and b are not same as object of c;
        System.out.println( a == b && b == c); // false


        // TO ONLY CHECK VALUES WE CAN USE (.euals()) METHOD; // 

        String d = "hi";
        String f = new String("hi");
        String g = "hi";
        System.out.println(d.equals(f)); //  true 
        System.out.println(d.equals(g)); // true 
        System.out.println(d == f); // false
        System.out.println(d == g); // ture
    }
}
