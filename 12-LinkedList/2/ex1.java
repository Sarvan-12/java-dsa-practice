// reverse a linked list(int)
public class ex1 {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // reverse a linked list
    public static void reverse(){
        if(head == null || head.next == null){
            return ;
        }
        Node prev = null;
        Node curNode = head;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = nextNode;
        }
        head = prev;
    }
    // recursive reverse a linked list
    // doubt
    public static Node recursiveReverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        head = new Node(values[0]);
        Node temp = head;
        for (int i = 1; i < values.length; i++) {
        temp = temp.next = new Node(values[i]);
        }

        // reverse();
        // head = recursiveReverse(head);
        reverse();
        
        printList();
    }
    
}
