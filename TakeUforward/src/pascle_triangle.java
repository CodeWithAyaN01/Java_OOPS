import java.util.Scanner;
public class pascle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = 4;
        int mid =0;
        int i=0;
        for(;i<=num ; i++,mid = i+i);
        {
            i++;
            System.out.println(mid+""+i+"\n");
        }


    }
}
