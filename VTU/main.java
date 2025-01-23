import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer;
        System.out.println("Enter the integer: ");
        integer = sc.nextInt();
        System.out.println("the integer is : " + integer);
        
        for (int i = 0 ; i < 3 ; i++)
        {
            System.out.println("i = " + i);
        }
    }
}