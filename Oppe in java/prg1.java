
import java.util.Scanner;
class Mentor
{
    String Mentor_name;
    String section;
    int score;

    void Display()
    {
        System.out.println("Mentor name is : " + Mentor_name);
        System.out.println("The teacher handels section: " + section);
        System.out.println("Student score to "+Mentor_name + " is "+ score);
        
    }
}
public class prg1{
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        Mentor BB = new Mentor(); // creating object BB
        System.out.print("Enter name: ");
        BB.Mentor_name = sc.nextLine(); // assigning values to BB

        System.out.print("Enter the section he/she is handling: ");
        BB.section = sc.nextLine();

        System.out.print("Enter the score you wnat to give: ");
        BB.score = sc.nextInt(); 
        System.out.println("\n ");
        System.out.println("***************************************************************************");
        System.out.println("                  Display function working here ");
        System.out.println("***************************************************************************\n");
        System.out.flush(); // clearing screen
        BB.Display();
    }
    
}