public class PrintLL {
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
        newNode = tail;
    }

    public void printLL(){
        int currNode = head.data;
        while(currNode != null){
            System.out.println(currNode + "-->");
        }
    }
    
    public static void main(String[] args){
            PrintLL list = new PrintLL();
            list.addFirst(2);
            list.addFirst(1);
            list.addLast(3);
            list.addLast(4);

            list.printLL();
        }
}
