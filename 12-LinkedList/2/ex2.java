// find nth node from the end of the linked list  + delete nth node from the end of the linked list

public class ex2 {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deleteNthNodeFromEnd(Node head, int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int index = size - n;
        Node prev = head;
        int i = 1;
        while(i< index){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void printListNode( Node head ){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        int []values = {1, 2, 3, 4, 5};
        Node head = new Node(values[0]);
        Node temp = head;
        for(int i = 1; i < values.length; i++){
            temp = temp.next = new Node(values[i]);
        }
        head = deleteNthNodeFromEnd(head, 2);
        printListNode(head);
        
    }
}
