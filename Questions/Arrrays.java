// {
//     public static void main(String[] args)
//     {
//         System.out.println("Welcome");
//         Scanner sc = new Scanner(System.in);
//         String[] name = new String[4];
//         for (int i = 0; i < name.length ; i++){ //  only length not length()
//             System.out.println("Enter name " + (i+1));
//             name[i] = sc.next();
//         }
//         System.out.println(Arrays.toString(name));
//     }
// }
import java.util.Arrays;
import java.util.Scanner;
public class Arrrays
{
    public static void main(String[] args) {
        System.out.println("Enter the array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Column: ");
        int column = sc.nextInt();
        int matrix[][] = new int[rows][column];
        System.out.println("enter the Elems: ");
        
        // for (int i = 0 ; i<rows ; i++ )
        // {
        //     for (int j = 0 ; j<column ; j++)
        //         {
        //             matrix[i][j] = sc.nextInt();
        //         }
        // }

        // one more way of writing this is:

        for (int i = 0 ; i < matrix.length ; i++) //  this will give no of rows
        {
            for (int j = 0 ; j < matrix[i].length ; j++) //  this will give no of cloumn in the particular rows
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix)); // deep to String
    }
}