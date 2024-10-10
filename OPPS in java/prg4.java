
import java.util.Scanner;

class function{
    int n;
    int[] stack;
    int top;

    function(int n)
    {
        this.n = n;
        stack = new int[n];
        top =-1;
    }

    void push(int num)
    {
        if (top == n-1)
        {
            System.out.println("Stack is over full");
        }
         //  pos upgrade;
        stack[++top] = num;
    }

    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack under flow!");
        }
        return stack[top--];
    }

    int peak()
    {
        return stack[top];
    }
    void display()
    {
        for (int i = top ; i>=0 ; i--)
        {
            System.out.println(" " + stack[i]);
        }
    }

}
public class prg4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack size:"); int StackSize = sc.nextInt();
        function s = new function(StackSize);
        System.out.print("Enter equation: ");String equation = sc.next();
        // System.out.println(""+equation);
        System.out.print("Length of equation is : " + equation.length());
        for (int i = 0 ; i < equation.length() ; i++)
        {
            s.push((int)(equation.charAt(i))); // iterating char
        }
        s.display();

    }
}