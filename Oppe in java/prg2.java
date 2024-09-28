import java.util.Scanner;
 //  calss name 
class Mentoring_for_Student_IS
{   
    int usn;
    String StudentName;
    // THIS IS A UNPARAMETERIZED CONSTRUCTER // 
    Mentoring_for_Student_IS() {
        usn = 0;
        StudentName = "unknown";
    }

    // dispaly function 
    void Display()
    {
        // System.out.println("********************************************************************");
        // System.out.println("                Welcome to Mentoring System");
        // System.out.println("********************************************************************");

        System.out.println("The student name is"+ StudentName);
        System.out.print("USN of " + StudentName + " is: " + usn);
        // System.out.println("end");
    }
}
public class prg2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Student are there: ");
        int n = sc.nextInt();
        Mentoring_for_Student_IS[] stdInfo = new Mentoring_for_Student_IS[n]; // making array of student[] of n size and askin n from user
        
        for(int i = 0 ; i<n ; i ++)
        {
            stdInfo[i] = new Mentoring_for_Student_IS(); //this is to initilizse a object;
            System.out.println("Enter details of Student "+(i+1));
            System.out.print("Enter the usn of Student:");
            stdInfo[i].usn = sc.nextInt();
            sc.nextLine(); // commenting this line shows you error; 
            System.out.print("Enter the nane Of student: ");
            stdInfo[i].StudentName = sc.nextLine();
        }

        for (int a = 0 ; a<n ; a++)
        {
            stdInfo[a].Display();
            System.out.println("\n");
        }
    }
}