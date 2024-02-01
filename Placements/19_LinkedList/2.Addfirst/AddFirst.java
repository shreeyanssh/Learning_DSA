public class AddFirst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }   
    }    
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //Creating a Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;                 //Case when it's the first Node.
        }

        //Store the value of head in next
        newNode.next = head;

        //Changing the head to newNode
        head = newNode;
    }

    public static void main(String[] args){
        AddFirst ll = new AddFirst();

        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
