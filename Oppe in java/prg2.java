import java.util.Scanner;
import java.util.ArrayList;
import java.util.Array;
 //  calss name 
class Mentoring_for_Student_IS
{   
    int usn;
    String StudentName;
    // THIS IS A CONSTRUCTER // 
    Mentoring_for_Student_IS(int usn , String StudentName) {
        this.usn = usn;
        this.StudentName = StudentName;
    }

    // dispaly function 
    void Display()
    {
        System.out.println("********************************************************************");
        System.out.println("                Welcome to Mentoring System");
        System.out.println("********************************************************************");

        System.out.print("The student name is : " + StudentName);
        System.out.print("USN of " + StudentName + " is: " + usn);
        System.out.println("end");
    }
}
public class prg2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rolls = new int[100];
        System.out.println("How many student details you want to add: ");
        int countStd = nextInt();
        for (int i = 0 ; i<countStd ; i++)
        {
            
        }
        
    }
}
