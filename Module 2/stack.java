class Stackk
{
    int[] stck = new int[10];
    int top;

    Stackk()
    {
        top = -1;
    }
    void push(int m)
    {
        stck[++top] = m;
    }
    int pop()
    {
       return stck[top--] ;
    }
    void dispaly()
    {
        for (int i = top ; i>=0 ; i--)
        {
            System.out.print(" "+stck[i]);
        }
    }
}
public class stack
{
    public static void main(String[] args) {
        Stackk s = new Stackk();
        s.push(5);
        s.pop();
        s.push(10);
        s.push(13);
        s.push(1);
        s.pop();
        s.dispaly();
    }
}