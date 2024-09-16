
import java.util.Scanner;

public class newSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The new switch case in java ! \n\n");

        System.out.print("Enter any name : ");

        String name = sc.next();
        

        // this is new switch syntax in this we dont need a break statement and all;

        switch (name)
        {
            case "Pandey" -> System.out.println("Doke baj");
            case "Ashutosh" -> System.out.println("Doke baj 2");
            case "kumar" -> System.out.println("you has to ");
            case  "sout" -> System.out.println("direct print statement");
        }
    }
    
}
