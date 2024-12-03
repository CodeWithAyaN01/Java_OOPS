import java.util.Scanner;
public class Matrix01s {
    static Scanner sc = new Scanner(System.in);
    static int rows;
    static int col;
    static char[][] a = new char[10][10];
    static char[][] b = new char[10][10];

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
        TakeInput();
        // DisplayMatrix();
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                if (a[i][j] == '0')
                {
                    for(int p = 0 ; p < rows ; p++)
                    {
                        a[p][i] = '0';
                    }
                    for(int k = 0 ; k < col ; k++)
                    {
                        a[i][k] = '0';
                    }
                }
            }
        }
        DisplayMatrix(a);
    }
}



