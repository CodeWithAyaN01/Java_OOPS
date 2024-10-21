import java.util.Scanner;
public class Marks {
    static void takemarks(int[] subject , String Subname)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<=3 ; i++)
        {
            System.out.println("Enter the marks of"+Subname+""+i+1+":");
            subject[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter thre marks of your maths exams");
        Scanner sc = new Scanner(System.in); //  scanner
        int[] maths = new int[3];
        int[] ddco = new int[3];
        int[] java = new int[3];
        int[] os = new int[3];
        int[] dsa = new int[3];
        takemarks(maths,"Maths");
        for (int i = 0 ; i<=3 ; i++)
        {
            System.out.println(maths[i]);
        } 
    }
}
