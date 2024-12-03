// package IA1;
class Stack1
{
    int max;
    int[] stack;
    int top;

    public Stack1(int max){ // constructor for assigning values;
        this.max = max;
        stack = new int[max];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1; // if true stack is Empty;
    }

    public boolean isFull(){
        return top == max-1; // if true its full 
    }

    public void push(int value){ // push
        if (!isFull())
        {
            stack[++top] = value;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop(){ // pop
        if (!isEmpty())
        {
            return stack[top--];
        }
        else
        {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public void display() // display
    {
        System.out.println("Elements of stack are: ");
        for (int i = 0 ; i <= top ; i++) // issue
        {
            System.out.print(" "+stack[i]);
        }
        System.out.println();
    }
}

public class Program2 {
    public static void main(String[] args) {
        Stack1 s = new Stack1(10);
        s.push(10);
        s.push(30);
        s.push(44);
        s.pop();
        s.pop();
        s.push(34);
        s.push(67);
        s.display();
    }    
}
