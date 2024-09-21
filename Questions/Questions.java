
import java.util.Scanner;

public class Questions
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number!: ");
        int number = input.nextInt();
        System.out.println();
        isprime(number);
    }
    static void  isprime(int a)
    {
        int i = 2;
        while(i<=a)
        {
            if (a % i == 0){
                System.out.println("not a prime ! ");break;
            }
            if (a % i != 0)
            {
                System.out.println("a prime!");break;
            }
            i++;
        }
    }
    
}