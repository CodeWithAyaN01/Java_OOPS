// package String Builder;

public class basic {
    public static void main(String[] args) {
        String name = "Ayan Gupta"; //  here both the variables are pointing to same object Ayan Gupta only
        String name2 = "Ayan Gupta"; //  if try to change name then Java creates new object and then variable (name2) pointes to new object
        System.out.println(name2);
        name2 = "Ayan Only";
        System.out.println(name2); //  name 2 creates new object and it pointes to new object
        
    }
}
