import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        
        // to count the same give occurring number //

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        long number = sc.nextInt();
        String str;
        
        str = String.valueOf(number);
        
        int len = str.length();
        int count=0;
        
        System.out.println("Enter number you wnat to count : ");
        int num = sc.nextInt();
        String charr = String.valueOf(num);

        for (int i = 0 ; i<len ; i++)
        {
            if (str.charAt(i) == charr.charAt(0))
            {
                count++;
            }

        }
        System.out.println("The number occurs : "+ count + " Times");


      





    }
}
