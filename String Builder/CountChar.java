
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the String: ");
        String name = sc.nextLine();
        System.out.println("The length of String is : "+name.length());
        System.out.print("Enter the character:");
        char C = sc.next().charAt(0);
        for (int i = 0 ; i<name.length() ; i++)
        {
            if (name.charAt(i) == C)
            {
                count++;
            }
        }
        System.out.println("So the Letter " + C + "occurs " +count+ " Times");
    }
}
