// DLL

public class ex1 {
    static Node head;
    static class Node {
        int data;
        Node next ;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void printListForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            if (temp.next == null) break; 
            temp = temp.next;
        }
        System.out.println("null");
        printListBackward(temp);
    }
    
    public static void printListBackward(Node tail) {
        System.out.print("null");
        while (tail != null) {
            System.out.print(" <- "+tail.data);
            tail = tail.prev;
        }
    }
    // insert at head
    public static void insertHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
    // insert at tail
    public static void insertTail(int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.prev = temp;
    }
    // insert at kth position
    public static void insertKthNode(int k, int data){
        if(k == 1){
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            head = temp;
            return;
        }
        // Node temp = head;
        // int i = 1;
        // while(i < k-1){
        //     temp = temp.next;
        //     i++;
        // }
        // Node newNode = new Node(data);
        // temp.next = newNode;
        // newNode.prev = temp;
        // newNode.next = temp.next.next;
        // temp.next.next.prev = newNode;
        Node temp = head;
        int i = 1;
        while(i < k-1){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next.prev = newNode;
    }
    
    // delete head
    public static void deleteHead(){
        if(head == null || head.next == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }
    // delete tail in DLL
    public static void deleteTail(){
        if(head == null || head.next == null){
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    // delete kth node in DLL
    public static void deleteKthNode(int k){
        if(head == null || head.next == null){
            return;
        }
        if(k == 1){
            deleteHead();
            return;
        }
        Node temp = head;
        int i = 1;
        while(i < k-1){
            temp = temp.next;
            i++;
        }
        if(temp.next.next == null){
            deleteTail();
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    // delete data from dll
    public static void deleteData(int data){
        if(head == null || head.next == null){
            return;
        }
        if(head.data == data){
            deleteHead();
            return;
        }
        Node temp = head;
        while(temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next.next == null){
            deleteTail();
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public static void main(String[] args) {
        int []values = {1, 2, 3, 4, 5};
        head = new Node(values[0]);
        Node back = head;
        for(int i = 1; i < values.length; i++){
            Node temp = new Node(values[i]);
            temp.prev = back;
            back.next = temp;
            back = temp;
        }
        // deleteHead();
        // deleteTail();
        // deleteKthNode(5);
        // deleteData(4);
        // insertHead(0);
        // insertTail(6);
        insertKthNode(3, 5);
        printListForward();
    }
}
