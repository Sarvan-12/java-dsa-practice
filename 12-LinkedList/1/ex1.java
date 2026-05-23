
public class ex1 {
    static Node head;
    static int size;
    ex1(){
        this.head = null;
        this.size = 0;
    }

    static class  Node {
        String data;
        Node next;
        Node(String data) {   //constructor
            this.data = data;
            this.next = null;
        }
    }
    //addFirst
    public static void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last
    public static void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return ;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // delete first
    static void deleteFirst(){
        if(head == null){
            return ;
        }
        size--;
        head = head.next;
    }
    // delete last
    static void deleteLast(){
        if(head == null){
            return ;
        }
        size--;
        if(head.next == null){
            head = null;
            return ;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    // display
    static void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null, "+size);
    }

    public static void main(String[] args) {
        addFirst("a");
        addFirst("is");
        addLast("list");
        addFirst("This");
        printList();
        deleteFirst();
        printList();
        deleteLast();
        printList();

    }
}
