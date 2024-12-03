// package IA1;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q,m,n; //  matrix rows and column;
        System.out.println("Enter the rows and column of 1st matrix");
        p = sc.nextInt(); // row
        q = sc.nextInt(); // column
        System.out.println("Enter the rows and column of 2nd matrix");
        m = sc.nextInt(); // row
        n = sc.nextInt(); // column
        if (p == m && q == n)
        {
            int[][] a = new int[p][q];
            int[][] b = new int[p][q];
            int[][] add = new int[p][n];
            
            System.out.println("Enter details of 1st matrix");
            for (int i = 0 ; i<p ; i++)
                for (int j=0 ; j<q ; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            System.out.println("Enter details of 2nd matrix");
            for (int i = 0 ; i<m ; i++)
                for (int j=0 ; j<n ; j++)
                {
                    b[i][j] = sc.nextInt();
                }
            // printing;
            System.out.println("1st matrix");
            for (int i = 0 ; i<p ; i++)
            {
                for (int j=0 ; j<q ; j++)
                {
                    System.out.print("\t"+a[i][j]);
                }
                System.out.println();
            }
            System.out.println("Secong matrix");
            for (int i = 0 ; i<p ; i++)
            {
                for (int j=0 ; j<q ; j++)
                {
                    System.out.print("\t"+b[i][j]);
                }
                System.out.println();
            }

            // adding;
            for (int i = 0 ; i<p ; i++)
            {
                for (int j=0 ; j<n ; j++)
                {
                    add[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("the final matrix is ");
            for (int i = 0 ; i<p ; i++)
            {
                for (int j=0 ; j<q ; j++)
                {
                    System.out.print("\t"+add[i][j]);
                }
                System.out.println();
            }
        }

    }   
}
