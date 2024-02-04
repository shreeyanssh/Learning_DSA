public class AddMiddle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    

    public Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int data){

    }

    public void printLL(Node node){
        if(node == null){
            System.out.print("Null");
            return;
        }
        System.out.print(node.data + "->");
        printLL(node.next);
    }

    public static void main(String[] args){
        AddMiddle list = new AddMiddle();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);

        list.printLL(list.head);
    }
}
