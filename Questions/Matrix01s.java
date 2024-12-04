import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int col;
    static char[][] a = new char[10][10];
    static char[][] b = new char[10][10];
    static ArrayList<Integer> R = new ArrayList<>();
    static ArrayList<Integer> C = new ArrayList<>();
    static int num = 0;
    static int c= 0;
    static int k= 0;


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
                    // R[q++] = i;
                    // C[r++] = j;
                    R.add(i);
                    C.add(j);
                }
            }
        }

        // System.out.println("Rows are : "+R); 
        for (int c = 0 ; c < R.size() ; c++)
        {
            int row = R.get(c);
            for (int f = 0 ; f<col ; f++)
            {
                a[row][f] = '0';
            }
        }
        
        for (int c = 0 ; c < C.size() ; c++)
        {
            int coln = C.get(c);
            for (int f = 0 ; f<rows ; f++)
            {
                a[f][coln] = '0';
            }
        }
        DisplayMatrix(a);
    }
}



