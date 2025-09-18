



class Node{
    int data;
    Node next;

    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }
    Node(int data)
    {
        this.data=data;
        this.next = null;
    }
}

public class insertAtHead {

    Node insertAtHead(Node head,int value)
    {
        Node temp = new Node(value);
        temp.next = head;
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
    
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        insertAtHead obj = new insertAtHead();
        head = obj.insertAtHead(head,0);
        Node temp = head;
        while(temp!=null)
        {
            System.out.println("The node Value is : "+ temp.data);
            temp = temp.next;
        }
    }
}




