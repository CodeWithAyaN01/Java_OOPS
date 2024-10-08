import java.util.Scanner;
public class prg3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // setting up matrix: 
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] add = new int[3][3];
        // taking values for m1 ;

        for (int i = 0 ; i <3 ; i++)
        {
            for (int j = 0 ; j<3 ; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }

        // taking values for m2 ;
        
        for (int i = 0 ; i <3 ; i++)
        {
            for (int j = 0 ; j<3 ; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        // adding matrix

        for (int i = 0 ; i <3 ; i++)
        {
            for (int j = 0 ; j<3 ; j++)
            {
                add[i][j] = m1[i][j] + m2[i][j];
            }
        }
        
        System.out.println("printing matrix: ");
        
        for (int i = 0 ; i <3 ; i++)
        {
            for (int j = 0 ; j<3 ; j++)
            {
                System.out.print(" " + add[i][j]);
            }
            System.out.println("\n");
        }


    }
}