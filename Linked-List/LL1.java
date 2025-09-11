class Node {
    Integer data;
    Node next;

    Node(Integer data,Node next) { // Constructor for the Node data and also the next pointer;
        this.data = data;
        this.next = next;
    }

    Node(Integer data) //  if the next is not given the next will be next
    {
        this.data = data;
        this.next = null;
    } 
}

class LL1{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Node y = new Node(5,null); 

        // here the node is created named as y and it contains data value and next node address to print the node we need to do ot as y.data to get the values;

        System.out.println(y.data);

    }
}