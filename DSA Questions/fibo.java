
import java.util.Scanner;

public class fibo
{
    public static void main(String[] args) {
        System.out.println("Welcome to my Program for Fibonaci ");
        Scanner sc = new Scanner(System.in);
        //  to make fibonaci 

        int a = 0 ; int b = 1 ;
        int num;
        int temp;

        System.out.println("Enter the number till you wnat fibnaci");

        num = sc.nextInt();

        for (int i = 0 ; i<num ; i++)
        {
            System.out.print(a);
            temp = b;
            a = a+b;
            b = a;
            a = temp;
        }
    }
}