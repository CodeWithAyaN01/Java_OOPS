
import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LL2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        LinkedList<Integer> list = new LinkedList<>();
        Node head = new Node(array[0],null); // assigning he first value of array to the head node 
        Node current = head;
        for(int i=1;i< array.length ;i++)
        {
            Node node = new Node(array[i],null); //  created a node after the head node
            current.next = node; // as current = head the current.next linked the next node.
            current = node; // the current shifted to the next node;
        }

        // traversing the LL list;
        Node temp = head;;
        while(temp != null)
        {
            System.out.printf("the values are: %d\n",temp.data);
            temp = temp.next;
        }

        System.out.println("THE MAN MADE LINKED LIST IS OVER\n\n\n\n\n Time for the Inbuilt functions");

         for(int i=0;i< array.length ;i++)
        {
            list.add(array[i]);
        }
        System.out.println(list);
        
    }
}
