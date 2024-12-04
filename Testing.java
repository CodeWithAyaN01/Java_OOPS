import java.util.Arrays;
import java.util.Scanner;
public class Testing {
    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int col;
    static char[][] a = new char[10][10];
    static char[][] b = new char[10][10];
    static int[] R = new int[rows+1];
    static int[] C = new int[col+1];

    static void TakeInput()
    {   
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the numebr of Col: ");
        col = sc.nextInt();
        System.out.print("Start Entering the Matrix: \n");
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                a[i][j] = sc.next().charAt(0);
            }
        }
    }
    static void DisplayMatrix(char[][] mat) {
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int q = 0;
        int r = 0;
        TakeInput();
        for (int i = 0 ; i<rows ; i++)
        {
            for (int j = 0 ; j < col ; j++)
            {
                if (a[i][j] == '0')
                {
                    R[q++] = i;
                    C[r++] = j;
                }
            }
        }

        System.out.println("Rows are : "+Arrays.toString(R));
        System.out.println("col are: "+Arrays.toString(C));
        for (int i = 0 ; i<col ; i++)
        {
            int c= 0;
            a[R[c]][i] = '0';
            c++;
        }
        for (int j = 0 ; j<rows ; j++)
        {
            int k = 0;
            a[j][C[k]] = '0';
        }
        DisplayMatrix(a);
    }
}



