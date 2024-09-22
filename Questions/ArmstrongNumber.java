import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Printing armsstrong number");
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter number You want: ");
        int number = input.nextInt();
        armstrong(number);
        
    }
    static void armstrong(int num)
    {
        int Arm = 0;
        int originalNum = num;
        while (num>0) // loop condition 
        {   
            Arm += Math.pow(num%10, 3);
            num = num/10;
        }
        if (Arm == originalNum)
        {
           System.out.println("Yes the number is ArmStrong number");
        }
        else{
            System.out.println("not a Armstrong number");
        }
    }
}
