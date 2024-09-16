
import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The new switch case in java ! \n\n");        
        System.out.print("Enter anything 1 : ");
        String name = sc.next();
        System.out.print("Enter anythig 2 : ");
        String old_name = sc.next();
        

        // this is new switch syntax in this we dont need a break statement and all;

        switch (name)
        {
            case "Pandey" -> System.out.println("Doke baj");
            case "Ashutosh" -> System.out.println("Doke baj 2");
            case "kumar" -> System.out.println("you has to ");
            case  "sout" -> System.out.println("direct print statement");
            default -> System.out.println("hey please dont waste time and code");
        }
            // THIS IS THE OLD SWITCH WHICH WE USE IN C LANGUAGE //
        switch (old_name)
        {
            case "any":
                System.out.println("HI");break;
            case "bro":
            System.out.println("kaise ho bhai");break;
            default:
                System.out.println("kuch ni hota bhai");
        }
    }
    
}
