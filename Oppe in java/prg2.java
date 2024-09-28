import java.util.Scanner;
 //  calss name 
class Mentoring_for_Student_IS
{   
    int usn;
    String StudentName;
    // THIS IS A UNPARAMETERIZED CONSTRUCTER // 
    Mentoring_for_Student_IS() {
        usn = 0;
        StudentName = "NULL";
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
        Mentoring_for_Student_IS s1 = new Mentoring_for_Student_IS();
        s1.usn = 037;
        s1.StudentName = "Ayna";
        s1.Display();
    }
}
