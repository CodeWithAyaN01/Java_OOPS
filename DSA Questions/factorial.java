
import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial \n\n");
        Scanner sc = new Scanner(System.in);
        
        int num;
        int out = 1;

        System.out.println("Enter the number till you want facorial: ");
        num = sc.nextInt(); // taking values;

        for (int i = 1 ; i<=num ; i++)
        {
            out = i * out;
        }
        System.out.println(out);
    }
}
