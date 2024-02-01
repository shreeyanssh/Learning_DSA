public class AddLast {
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

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;   //Case when it's the first Node.
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public static void main(String[] args){
        AddLast lastlist = new AddLast();
        lastlist.addLast(2);
        lastlist.addLast(3);
        lastlist.addLast(4);
    }
}
