public class DeleteNode{
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

    public void printll(Node node){
        if(node == null){
            System.out.println("NULL");
            return;
        }
        System.out.print(node.data + "->");
        printll(node.next);
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is Empty.");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is Empty.");
        }

        Node lastNode = head.next;
        Node secLastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }

        secLastNode.next = null;
    }

    public static void main(String[] args){
        DeleteNode list = new DeleteNode();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);

        list.printll(list.head);

        list.deleteFirst();
        list.deleteLast();

        list.printll(list.head);
    }
}